package com.doubts;

import java.util.*;
import java.util.Map.Entry;

public class DemoMapIteration {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
		map.put("delhi", "india gate");
		map.put("chennai", "MahaBalipuram");
		map.put("mumbai", " gate way of india");

		// not the best way
		System.out.println("---------using keyset------------");
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println(key + " : " + map.get(key));
		}

		// better way
		System.out.println("---------using entry set------------");
		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> entry: entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		//java 8
		System.out.println("---------using java 8 syn------------");
		map.forEach((k, v)->System.out.println(k+ ": "+ v));

	}
}
