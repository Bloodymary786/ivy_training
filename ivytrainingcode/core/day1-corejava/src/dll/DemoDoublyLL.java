package dll;

class Node {
	int data;
	public Node(int myData) {
		data=myData;
		next=prev=null;
	}
	Node next, prev;

}

class DLL {
	Node first, last;

	public boolean isEmpty() {
		return first == null;
	}
	public void insertFirst(int data) {
		Node tempNode=new Node(data);	//333
		if(isEmpty()) {
			last=tempNode;
		}else {
			first.prev=tempNode;
		}
		tempNode.next=first;
		first=tempNode;
	}
	
	public void printForward() {
		Node temp=first;
		while(temp!=null) {
			System.out.print(temp.data +" <->");
			temp=temp.next;
		}
	}
	
	public void printBackword() {
		Node temp=last;
		while(temp!=null) {
			System.out.print(temp.data +" <->");
			temp=temp.prev;
		}
	}
}

public class DemoDoublyLL {

	public static void main(String[] args) {
			DLL dll=new DLL();
			
			dll.insertFirst(303);
			dll.insertFirst(3);
			dll.insertFirst(40);
			dll.insertFirst(123);
			
			dll.printForward();
			
			System.out.println("-------------------------");
			
			dll.printBackword();
	}
}
