package queue;
class MyQueue{
	int MAX_SIZE;
	int arr[];
	int f, r, noOfItems;
	
	 MyQueue(int size) {
		MAX_SIZE=size;
		arr=new int[MAX_SIZE];
		f=0;
		r=-1;
		noOfItems=0;
	}
	void insert (int val) {
		if(r==MAX_SIZE-1) {
			System.out.println("can not insert more elements");
		}
		
		r++;
		arr[r]=val;
		noOfItems++;
	}
	int remove() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return -999;
		}
		int temp=arr[f];
		f++;
//		if(f==MAX_SIZE) {
//			f=0;//?
//		}
		noOfItems--;
		return temp;
	}
	int peek() {
		return arr[f];
	}
	
	boolean isFull() {
		return noOfItems==MAX_SIZE;
	}
	
	boolean isEmpty() {
		return noOfItems==0;
	}
	
}
public class DemoOwnQueue {
	public static void main(String[] args) {
		MyQueue myQueue=new MyQueue(5);
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
