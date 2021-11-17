package queue;
import java.util.*;
class MyQueue2{
	LinkedList<Integer>list=new LinkedList<Integer>();
	
	void insert(int data) {
		list.addFirst(data);
	}
	
	int remove() {
		return list.removeLast();
	}
	
}
public class ImpQueueUsingLL {
	
	public static void main(String[] args) {
		MyQueue2 myQueue2=new MyQueue2();
		myQueue2.insert(3);
		myQueue2.insert(53);
		myQueue2.insert(30);
		
		
		System.out.println(myQueue2.remove());
		System.out.println(myQueue2.remove());
		System.out.println(myQueue2.remove());
		
		
	}
}
