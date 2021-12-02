package com.demo2;

import java.util.*;
import java.util.Map.Entry;

public class TouristApp {
	private String companyName;
	private Map<String, String> places;

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setPlaces(Map<String, String> places) {
		this.places = places;
	}

	public void print() {
		System.out.println(companyName);

		Set<Entry<String, String>> entrySet = places.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}
}
