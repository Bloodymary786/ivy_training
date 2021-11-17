package doubt;

public class DemoComparable {

	public static void main(String[] args) {
		
		Integer it1=28;
		Integer it2=23;
		
		//int value =it1.compareTo(it2);
		int value=Integer.compare(it1, it2);
		
		System.out.println(value);
		
//		String a="hello";
//		String b="hello";
//		
//		int val= b.compareTo(a);
//		System.out.println(val);
		
	}
}
