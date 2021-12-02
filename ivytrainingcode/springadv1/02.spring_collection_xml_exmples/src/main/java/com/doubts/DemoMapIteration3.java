package com.doubts;

import java.util.*;
import java.util.Map.Entry;

public class DemoMapIteration3 {

	public static void main(String[] args) {

		Map<String, List<String>> map = new HashMap<>();
		
		map.put("delhi", Arrays.asList("India gate","lal kila","chandni chowk"));
		map.put("chennai", Arrays.asList("Mahabalipuram","Zoo","temple"));
	
//		System.out.println("---------using keyset------------");
//		Set<String> keySet = map.keySet();
//		for (String key : keySet) {
//			System.out.println(key + " : " + map.get(key));
//		}
//
//		// better way
		System.out.println("---------using entry set------------");
		Set<Entry<String, List<String>>> entrySet = map.entrySet();
		for (Entry<String, List<String>> entry: entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
//		//java 8
//		System.out.println("---------using java 8 syn------------");
//		map.forEach((k, v)->System.out.println(k+ ": "+ v));

	}
}
