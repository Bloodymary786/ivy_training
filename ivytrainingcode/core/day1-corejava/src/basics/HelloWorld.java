package basics;

import java.util.Scanner;

public class HelloWorld {
	//ctr+ space bar
	public static void main(String[] args) {
		//i love java 10 times
		//dry run : running the program using copy pen, brain
		
		//logical : check whether a no is a prime no or not ?
		//7, 5 , 15X
		
		/* 1. let assume no is a prime no isPrime=true
		 * 2. i divide this no from 2 to (n-1) if it is divisible then our
		 * 	 assumption is not correct and no is not a prime no else it is a prime no
		 */
		
		boolean isPrime =true;
		
		System.out.println("PE a no");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		
		//loop move from 2 to N-1
		for(int i=2; i<=(n-1); i++) {
			if(n%i==0) {
				isPrime=false;
				break;
			}
		}
		
		if(isPrime) 
			System.out.println("it is a prime no");
		else
			System.out.println("it is not a prime no");
		
		//memory leak?
		scanner.close();
	}
}
