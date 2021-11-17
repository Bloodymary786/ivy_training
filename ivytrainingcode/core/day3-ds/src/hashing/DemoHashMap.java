package hashing;
import java.awt.geom.GeneralPath;
import java.util.*;
import java.util.Map.Entry;
public class DemoHashMap {

	public static void main(String[] args) {
		//	K(Object)	V(Object)
		Map<String, Integer>map=new Hashtable<String, Integer>();
		
		//What 
		//O(1)
		map.put("raj", 89);
		map.put("ekta", 67);
		map.put("gunika", 91);
		map.put("ravi", 65);
		map.put(null,66);
		
		//O(1)
		//System.out.println(map.get("raj"));
		//how to iterante though map?
		
		//System.out.println(map);
		
		//Keyset : bad in performance ,
		//Shift+alt+L
		Set<String> keySet = map.keySet();
		System.out.println("---------using keyset--------------");
		for(String key: keySet) {
			System.out.println(key + " : "+ map.get(key));
		}
		
		System.out.println("----------using entrySet-------------");
		// entryset : better in performance?
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> entry: entrySet) {
			System.out.println(entry.getKey() + " : "+ entry.getValue());
		}
		
	}
}





