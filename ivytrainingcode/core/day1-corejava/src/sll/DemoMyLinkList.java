package sll;

import dll.Node;

class Node{
	int data;
	Node next;
	Node(int myData){
		data=myData;
		next=null;
	}
}

class LL2{
	
	Node f,l;
	LL2(){
		f=l=null;
	}
	boolean isEmpty() {
		return f==null;
	}
	//?
	void insertLast(int data) {
		Node newNode=new Node(data);//177
		l.next=newNode;
		l=l.next;
	}
	
	//?
	Node deleteLast() {
		return null;
		
	}
	void insertFirst(int data) {
		Node temp=new Node(data);
		if(isEmpty()) {
			l=temp;
		}
		temp.next=f;
		f=temp;
	}
	
	Node deleteFirst() {
		Node temp=f;
		f=f.next;
		return temp;
	}
	void displayList() {
		Node temp=f;
		while(temp!=null) {
			System.out.print(temp.data +"->");
			temp=temp.next;
		}
	}
}




//class LL{
//	Node f,l;
//	
//	boolean isEmpty() {
//		return f==null;
//	}
//	//?
//	void insertLast(int data) {
//		Node newNode=new Node(data);//177
//		
//		//i need to reach to the last node....
//		Node temp=f;
//		while(temp.next!=null) {
//			temp=temp.next;
//		}
//		
//		//finally add new node to the end
//		
//		temp.next=newNode;
//		
//	}
//	
//	//?
//	Node deleteLast() {
//		return null;
//		
//	}
//	void insertFirst(int data) {
//		Node temp=new Node(data);
//		temp.next=f;
//		f=temp;
//	}
//	Node deleteFirst() {
//		Node temp=f;
//		f=f.next;
//		return temp;
//	}
//	void displayList() {
//		Node temp=f;
//		while(temp!=null) {
//			System.out.print(temp.data +"->");
//			temp=temp.next;
//		}
//	}
//}
public class DemoMyLinkList {

	public static void main(String[] args) {
		//SLL, CLL ,DLL
		LL2 list=new LL2();
		list.insertFirst(44);
		list.insertFirst(4);
		list.insertFirst(94);
		list.insertFirst(12);
		
	
		list.insertLast(177);
		
		list.displayList();
		
//		Node deletedNode= list.deleteFirst();
//		System.out.println("node deleted:"+deletedNode.data);
//		
//		
//		System.out.println("printing after node deletion");
//		
//		list.displayList();
	}
	
}









