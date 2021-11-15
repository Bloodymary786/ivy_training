package stack2;

class Stack {
	int arr[];
	int top;
	int MAX_SIZE = 10;

	Stack(int size) {
		top = -1;// stack is empty
		MAX_SIZE = size;
		arr = new int[MAX_SIZE];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == MAX_SIZE - 1;
	}

	public void push(int data) {
		if (!isFull()) {
			arr[++top] = data;
		} else
			System.out.println("stack is full");
	}

	public int pop() {
		if (!isEmpty()) {
			return arr[top--];
		} else {
			System.out.println("stack is empty");
			return -999;
		}

	}
}

public class DemoOurOwnStack {

	public static void main(String[] args) {

		Stack stack=new Stack(5);
		
		stack.push(44);
		stack.push(94);
		stack.push(97);
		stack.push(404);
		stack.push(4);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
		
		
		
	}
}




