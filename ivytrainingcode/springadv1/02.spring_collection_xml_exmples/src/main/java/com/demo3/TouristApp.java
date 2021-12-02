package com.demo3;

import java.util.*;
import java.util.Map.Entry;

public class TouristApp {

	private String companyName;
	private Map<String, List<String>> places;

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public void setPlaces(Map<String, List<String>> places) {
		this.places = places;
	}

	
	public void print() {
		System.out.println(companyName);

		Set<Entry<String, List<String>>> entrySet = places.entrySet();
		for (Entry<String, List<String>> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}
}
