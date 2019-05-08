package ca.bell.rest;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import ca.bell.model.QueryResult;
import ca.bell.model.SearchResult;
import ca.bell.model.SearchResultItem;

import java.util.logging.*;

@Path("/itunes")
public class ItunesService {

	// ========================================================================================================
	// ========================================================================================================
	// ========================================================================================================

	private static Logger log = Logger.getLogger (ItunesService.class.getName());
	
	private static final String ITUNES_SEARCH_URL = "https://itunes.apple.com/search";

	@GET
	@Path("/search")
	@Produces(MediaType.APPLICATION_JSON)
	public Response search(@QueryParam("artistFirstName") String artistFirstName,
			@QueryParam("artistLastName") String artistLastName) {

		log.info("starting search");
		Client client = null;
		WebTarget target = null;
		
		int responseCode = 200;
		String responseMessage = null;
		

		try {
			// define variables to make the ws call

			log.info("building query string for term");
			StringBuilder sbTermValue = new StringBuilder("");

			if (artistFirstName != null) {
				sbTermValue.append(artistFirstName);
			}

			if (artistLastName != null) {
				// if we have a first name in the string then add plus sign in between
				if (sbTermValue.length() > 0) {
					sbTermValue.append("+");
				}

				sbTermValue.append(artistLastName);
			}
			
			log.info("term parameter set to: " + sbTermValue.toString());

			// initialize the call
			log.info("instantiating new client");
			client = ClientBuilder.newClient();
			String results = client.target(ITUNES_SEARCH_URL).queryParam("term", sbTermValue.toString())
					.request(MediaType.APPLICATION_JSON).get(String.class);

			log.info("got results: " + results);
			
			Gson gson = new Gson();
			SearchResult result = gson.fromJson(results, SearchResult.class);

			// I know this looks ridiculous to take a container that already looks good and
			// refill
			// another set of containers but I'm assuming that in real life some additional
			// processing
			// and enhancements would be done here. Otherwise the json->object->json
			// transformation would be quite unecessary

			// I'm keeping the return array small (to the parameters originally asked. We
			// could add more but wanting to keep
			// payload to a minimum in to save on bandwidth

			ArrayList<QueryResult> returnList = new ArrayList<QueryResult>();

			//iterate through search results and populate our return list
			for (SearchResultItem searchItem : result.getResults()) {
				QueryResult qr = new QueryResult(searchItem.getArtistName(), searchItem.getCollectionName(),
						searchItem.getTrackName(), searchItem.getPrimaryGenreName());
				returnList.add(qr);
			}

			String json = gson.toJson(returnList);
			
			responseMessage = json;
			responseCode = 200;
			
		} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			log.severe("GOT A JSON EXCEPTION: " + e.getMessage());
			e.printStackTrace();
			responseCode = 500;
			responseMessage = e.getMessage(); 
		} finally {
			target = null;

			// if client is still an object, try to close it. if it fails to close, log it
			// and set it
			// to null regardless
			if (client != null) {
				try {
					client.close();
				} catch (Exception e) {
					log.severe("got an exception closing client");
				} finally {
					client = null;
				}

			}

		}
		log.info("about to return response code: " + responseCode);
		return Response.status(responseCode).entity(responseMessage).build();
	}

}
