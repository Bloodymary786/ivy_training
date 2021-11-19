package asignments_interface;
public class MyQueue implements Queue {
	private int MAX_SIZE;
	private int arr[];
	private int f, r, noOfItems;
	
	public  MyQueue(int size) {
		MAX_SIZE=size;
		arr=new int[MAX_SIZE];
		f=0;
		r=-1;
		noOfItems=0;
	}
	@Override
	public void insert (int val) {
		if(r==MAX_SIZE-1) {
			System.out.println("can not insert more elements");
		}
		
		r++;
		arr[r]=val;
		noOfItems++;
	}
	@Override
	public int remove() {
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
	@Override
	public int peek() {
		return arr[f];
	}
	
	@Override
	public boolean isFull() {
		return noOfItems==MAX_SIZE;
	}
	
	boolean isEmpty() {
		return noOfItems==0;
	}
	
}