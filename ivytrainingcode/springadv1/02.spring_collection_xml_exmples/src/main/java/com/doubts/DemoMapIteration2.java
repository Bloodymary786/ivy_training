package com.doubts;

import java.util.*;
import java.util.Map.Entry;

public class DemoMapIteration2 {

	public static void main(String[] args) {

		Map<String, Place> map = new HashMap<String,Place>();
		map.put("delhi", new Place("India gate","9"));
		map.put("chennai", new Place("MahaBalipuram", "10"));
	
//		System.out.println("---------using keyset------------");
//		Set<String> keySet = map.keySet();
//		for (String key : keySet) {
//			System.out.println(key + " : " + map.get(key));
//		}
//
//		// better way
		System.out.println("---------using entry set------------");
		Set<Entry<String, Place>> entrySet = map.entrySet();
		for (Entry<String, Place> entry: entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
//		//java 8
//		System.out.println("---------using java 8 syn------------");
//		map.forEach((k, v)->System.out.println(k+ ": "+ v));

	}
}
