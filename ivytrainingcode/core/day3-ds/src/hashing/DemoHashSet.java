package hashing;
import java.util.*;
public class DemoHashSet {

	public static void main(String[] args) {
	//	HashSet<String> set=new HashSet<String>();
	//	HashSet<String> set=new LinkedHashSet<String>();
		Set<String> set=new TreeSet<String>();
		set.add("raj");
		set.add("ekta");
		set.add(null);
		set.add("ravi");
		set.add("raj");
		System.out.println(set);
//		System.out.println(set.add("raj"));
//		System.out.println(set.add("ekta"));
//		System.out.println(set.add("ravi"));
//		System.out.println(set.add("raj"));
		
	}
}
