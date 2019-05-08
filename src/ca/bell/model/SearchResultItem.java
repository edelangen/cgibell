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
* This class provides the detail leve containers for the return of the itunes search operation
*
* @author  Edward de Langen
* @version 1.0
* @since   2019-05-08
*/
public class SearchResultItem {

	private String wrapperType;
	private String kind;
	private Long artistId;
	private Long collectionId;
	private Long trackId;
	private String artistName;
	private String collectionName;
	private String trackName;
	private String collectionCensoredName;
	private String trackCensoredName;
	private String artistViewUrl;
	private String collectionViewUrl;
	private String trackViewUrl;
	private String previewUrl;
	private String artworkUrl30;
	private String artworkUrl60;
	private String artworkUrl100;
	private Double collectionPrice;
	private Double trackPrice;
	private String releaseDate;
	private String collectionExplicitness;
	private String trackExplicitness;
	private String discCount;
	private String discNumber;
	private Long trackCount;
	private Long trackNumber;
	private Long trackTimeMillis;
	private String country;
	private String currency;
	private String primaryGenreName;
	private String isStreamable;
	
	
	
	//==GETTERS AND SETTERS==========================================================
	
	public String getWrapperType() {
		return wrapperType;
	}
	public void setWrapperType(String wrapperType) {
		this.wrapperType = wrapperType;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public Long getArtistId() {
		return artistId;
	}
	public void setArtistId(Long artistId) {
		this.artistId = artistId;
	}
	public Long getCollectionId() {
		return collectionId;
	}
	public void setCollectionId(Long collectionId) {
		this.collectionId = collectionId;
	}
	public Long getTrackId() {
		return trackId;
	}
	public void setTrackId(Long trackId) {
		this.trackId = trackId;
	}
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
	public String getCollectionCensoredName() {
		return collectionCensoredName;
	}
	public void setCollectionCensoredName(String collectionCensoredName) {
		this.collectionCensoredName = collectionCensoredName;
	}
	public String getTrackCensoredName() {
		return trackCensoredName;
	}
	public void setTrackCensoredName(String trackCensoredName) {
		this.trackCensoredName = trackCensoredName;
	}
	public String getArtistViewUrl() {
		return artistViewUrl;
	}
	public void setArtistViewUrl(String artistViewUrl) {
		this.artistViewUrl = artistViewUrl;
	}
	public String getCollectionViewUrl() {
		return collectionViewUrl;
	}
	public void setCollectionViewUrl(String collectionViewUrl) {
		this.collectionViewUrl = collectionViewUrl;
	}
	public String getTrackViewUrl() {
		return trackViewUrl;
	}
	public void setTrackViewUrl(String trackViewUrl) {
		this.trackViewUrl = trackViewUrl;
	}
	public String getPreviewUrl() {
		return previewUrl;
	}
	public void setPreviewUrl(String previewUrl) {
		this.previewUrl = previewUrl;
	}
	public String getArtworkUrl30() {
		return artworkUrl30;
	}
	public void setArtworkUrl30(String artworkUrl30) {
		this.artworkUrl30 = artworkUrl30;
	}
	public String getArtworkUrl60() {
		return artworkUrl60;
	}
	public void setArtworkUrl60(String artworkUrl60) {
		this.artworkUrl60 = artworkUrl60;
	}
	public String getArtworkUrl100() {
		return artworkUrl100;
	}
	public void setArtworkUrl100(String artworkUrl100) {
		this.artworkUrl100 = artworkUrl100;
	}
	public Double getCollectionPrice() {
		return collectionPrice;
	}
	public void setCollectionPrice(Double collectionPrice) {
		this.collectionPrice = collectionPrice;
	}
	public Double getTrackPrice() {
		return trackPrice;
	}
	public void setTrackPrice(Double trackPrice) {
		this.trackPrice = trackPrice;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getCollectionExplicitness() {
		return collectionExplicitness;
	}
	public void setCollectionExplicitness(String collectionExplicitness) {
		this.collectionExplicitness = collectionExplicitness;
	}
	public String getTrackExplicitness() {
		return trackExplicitness;
	}
	public void setTrackExplicitness(String trackExplicitness) {
		this.trackExplicitness = trackExplicitness;
	}
	public String getDiscCount() {
		return discCount;
	}
	public void setDiscCount(String discCount) {
		this.discCount = discCount;
	}
	public String getDiscNumber() {
		return discNumber;
	}
	public void setDiscNumber(String discNumber) {
		this.discNumber = discNumber;
	}
	public Long getTrackCount() {
		return trackCount;
	}
	public void setTrackCount(Long trackCount) {
		this.trackCount = trackCount;
	}
	public Long getTrackNumber() {
		return trackNumber;
	}
	public void setTrackNumber(Long trackNumber) {
		this.trackNumber = trackNumber;
	}
	public Long getTrackTimeMillis() {
		return trackTimeMillis;
	}
	public void setTrackTimeMillis(Long trackTimeMillis) {
		this.trackTimeMillis = trackTimeMillis;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getPrimaryGenreName() {
		return primaryGenreName;
	}
	public void setPrimaryGenreName(String primaryGenreName) {
		this.primaryGenreName = primaryGenreName;
	}
	public String getIsStreamable() {
		return isStreamable;
	}
	public void setIsStreamable(String isStreamable) {
		this.isStreamable = isStreamable;
	}
	
	
	
	
}
