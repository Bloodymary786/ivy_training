package queue;
import java.util.*;
public class DemoCollectionQueue {

	
	public static void main(String[] args) {
		//PriorityQueue is based on priority
		PriorityQueue<Integer> queue=new PriorityQueue<Integer>();
		queue.add(44);
		
		queue.add(23);	
		queue.add(3);
		queue.add(9);
		
		queue.add(12);
		queue.add(67);
		
		//I want to print all elements from PriorityQueue: Heap process *
//		Iterator<Integer> it =queue.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		//Correct way if u want to get data in the sorted way!
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
//		System.out.println(queue.remove());
//		System.out.println(queue.remove());
//		System.out.println(queue.remove());
//		System.out.println(queue.remove());
//		System.out.println(queue.remove());
//		
//		System.out.println(queue.remove());
		
	
		
		
		
		//methods of PQ
		/*
		 * 	offer(Object ob)					add(Object ob) : no difference , it grows 
		 * 
		 *   poll()								remove()
		 *   
		 *   peek()								element()
		 */
	}
}
