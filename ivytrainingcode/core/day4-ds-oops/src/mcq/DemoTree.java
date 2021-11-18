package mcq;
import java.util.*;
import java.util.Map.Entry;
//Comparable and Comparator
class StringRevSorter implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
}
public class DemoTree {

	public static void main(String[] args) {
		
		HashMap<String, Integer>map=new HashMap<String, Integer>();
		map.put("raj", 67);
		map.put("ravi", 87);
		map.put("ekta", 90);
		map.put("pooja", 56);
		
		//how to iterate through map?
		//keySet vs entrySet vs Java 8 (new syntex)
		
		Set<String> keySet=map.keySet();
		
//		for(String key: keySet) {
//			System.out.println(key + " : "+ map.get(key));
//		}
//		Iterator<String> it=keySet.iterator();
//		while(it.hasNext()) {
//			String key=it.next();
//			System.out.println(key + " : "+ map.get(key));
//		}
		
		//Set<Entry<String, Integer>> entrySet = map.entrySet();
//		
		Set<Entry<String, Integer>>entrySet= map.entrySet();
//		
//		for(Entry<String, Integer> entry: entrySet) {
//			System.out.println(entry.getKey() + " : "+ entry.getValue());
//		}
		
		Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			Entry<String, Integer> entry=iterator.next();
			System.out.println(entry.getKey()+ " "+ entry.getValue());
		}
		
		
		
		
		
		
		Set<String> set=new TreeSet<String>(new StringRevSorter());
		
		set.add("raj");
		set.add("raj");
		set.add("ekta");
		set.add("pooja");
		
//		for(String val: set) {
//			System.out.println(val);
//		}
		//ListIterator X
//		Iterator<String> it=set.iterator();
//		while(it.hasNext()) {
//			System.out.print(it.next()+" ");
//		}
	}
}


/*
 * 		Ordered, Sorted 
 * 
 * 				Collection (I)			Collections(C)
 * 	
 * 			Set							List				Queue
 * 
 * 	LinkedHashSet	HashSet TreeSet		AL, LL				PQ
 * 
 * 
 * 	Map:k, v
 * 	LinkedHashMap	HashMap TreeMap
 */



