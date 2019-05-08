package ca.bell.model;

public class QueryResult {

	private String artistName;
	private String collectionName;
	private String trackName;
	private String primaryGenreName;
	
	
	//===CONSTRUCTORS========================================
	
	public QueryResult()
	{
	}
	
	
	public QueryResult(String pArtistName,
					   String pCollectionName,
					   String pTrackName,
					   String pPrimaryGenreName)
	{
		this.artistName = pArtistName;
		this.collectionName = pCollectionName;
		this.trackName = pTrackName;
		this.primaryGenreName = pPrimaryGenreName;
	}
	
	//===GETTERS AND SETTERS==================================
	
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public String getCollectionName() {
		return collectionName;
	}
	public void setCollectionName(String collectionName) {
		this.collectionName = collectionName;
	}
	public String getTrackName() {
		return trackName;
	}
	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}
	public String getPrimaryGenreName() {
		return primaryGenreName;
	}
	public void setPrimaryGenreName(String primaryGenreName) {
		this.primaryGenreName = primaryGenreName;
	}
	
	
	
}
