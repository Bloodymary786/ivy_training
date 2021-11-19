package assignments_if_condition;

import java.util.Scanner;
//Write a program to check if a candidate is eligible for voting or not. (Hint: Check age)
public class Q1 {

	public static void main(String[] args) {
		
		int age;
		Scanner scanner=new Scanner(System.in);
		System.out.println("PE your age ...");
		age= scanner.nextInt();
		checkVotingRight(age);
		
		scanner.close();
	}

	private static void checkVotingRight(int age) {
		if(age >=18) {
			System.out.println("you are eligible");
		}else
			System.out.println("you are not eligible");
	}
}
