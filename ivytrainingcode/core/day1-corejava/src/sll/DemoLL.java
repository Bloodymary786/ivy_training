package sll;
import java.util.*;
public class DemoLL {

	public static void main(String[] args) {
		
		// DLL			Growable array
		//LinkedList vs ArrayList
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		list.add(44);
		list.add(4);
		list.add(44);
		list.add(94);
		list.add(13);
		
		System.out.println(list);
		
//		System.out.println("------original ll------------");
//		for(Integer temp: list) {
//			System.out.println(temp);
//		}
//		
		Collections.sort(list);
		System.out.println("------sorted ll------------");
		for(Integer temp: list) {
			System.out.println(temp);
		}
		
		//binary search ? data should be sorted 
		System.out.println("------postion of 3------");
		int index=Collections.binarySearch(list, 11);
		System.out.println(index);
		

		
		
		
		//System.out.println("----------using iterator----------------");
		
		//Iterator<Integer> it=list.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		
		//how iterator is working?
//		
//		it.next();
//		it.remove();
//		it.next();
//		it.remove();
//		
//		
//		while(it.hasNext()) {
//		System.out.println(it.next());
	}
		
		
		
	
}
