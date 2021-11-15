package stack;
import java.util.*;
public class DemoStack {

	public static void main(String[] args) {
		//LIFO real life app: recurresion, exp evalutaiton in computers
		//undo operation
		
		//i want to create statck, Queue, LinkedList, Tree, Map?
		//should i create myself or i use readymade lib?	==>"Collection API"=> it is a ready made DS
		
		//step 1: import that lib import java.util.*;
		//step 2: u need to decide what u want to use 
		
		//Stack, Queue, Tree, LinkedList, ArrayList, Set, Map
		
		Stack<Integer> stack=new Stack<>();
		//stack.push("rajiv");
		stack.push(4);
		stack.push(40);
		stack.push(1);
		stack.push(90);
		stack.push(41);
		stack.push(33);
		System.out.println("is stack is empty?"+stack.isEmpty());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println("is stack is empty?"+stack.isEmpty());
		
		
		
	}
}
