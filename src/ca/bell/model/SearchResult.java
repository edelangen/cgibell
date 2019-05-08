package ca.bell.model;

import java.util.ArrayList;

public class SearchResult {
	private Integer resultCount;
	private ArrayList<SearchResultItem> results;
	
	//===GETTERS AND SETTERS 
	
	public Integer getResultCount() {
		return resultCount;
	}
	public void setResultCount(Integer resultCount) {
		this.resultCount = resultCount;
	}
	public ArrayList<SearchResultItem> getResults() {
		return results;
	}
	public void setResults(ArrayList<SearchResultItem> results) {
		this.results = results;
	}
	
}
