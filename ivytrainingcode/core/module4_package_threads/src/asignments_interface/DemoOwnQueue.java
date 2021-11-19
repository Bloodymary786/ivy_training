package asignments_interface;

public class DemoOwnQueue {
	public static void main(String[] args) {
		Queue myQueue=new MyQueue(5);
		myQueue.insert(33);
		myQueue.insert(3);
		myQueue.insert(63);
		myQueue.insert(9);
		myQueue.insert(44);
		
		System.out.println(myQueue.remove());
		System.out.println(myQueue.remove());
		System.out.println(myQueue.remove());
		System.out.println(myQueue.remove());
		System.out.println(myQueue.remove());
		System.out.println("---------------------");
		System.out.println(myQueue.remove());
		
		
		
	}
}
