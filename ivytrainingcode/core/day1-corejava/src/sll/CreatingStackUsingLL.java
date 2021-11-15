package sll;

import java.util.*;

//	LIFO
class MyStack {
	private LinkedList<Integer> list = new LinkedList<Integer>();

	private boolean isEmpty() {
		return list.size() == 0;
	}

	public void push(int data) {
		list.addFirst(data);
	}

	public int pop() {
		if (!isEmpty()) {
			return list.removeFirst();
		} else
			return -999;
	}
}

public class CreatingStackUsingLL {

	public static void main(String[] args) {
		MyStack myStack=new MyStack();
		myStack.push(33);
		myStack.push(39);
		myStack.push(23);
		myStack.push(3);
		
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		
		
		
	}
}
