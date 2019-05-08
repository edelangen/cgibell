package ca.bell.model;

import java.util.ArrayList;

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
