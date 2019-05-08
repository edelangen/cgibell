package ca.bell.model;

/*
 * Copyright (C) 2019 Edward de Langen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at 
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 */

/**
* This class provides the query results for itunes searches
*
* @author  Edward de Langen
* @version 1.0
* @since   2019-05-08
*/
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
