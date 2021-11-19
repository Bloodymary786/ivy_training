package assignments_q1;

import java.util.Scanner;

import sun.awt.DisplayChangedListener;

/*
 * Write a program to accept 5 employee IDs and the corresponding names and their salaries
from the user and store them in three arrays. Pass these arrays to a function display() as
arguments. This display() will display the content of the arrays in the following format.
ID Name Salary
00 John 600000
002 Clark 550000
003 Nancy 500000
004 Joe 500000
005 Mary 300000
Question Statement 2

 */
public class Assignment1 {
	static final int NO_OF_EMP = 5;

	public static void main(String[] args) {

		String ids[] = new String[5];
		String names[] = new String[5];
		int salary[] = new int[5];
		Scanner scanner = new Scanner(System.in);
		System.out.println("PE ids name and salary ");

		// flush may be required
		for (int i = 0; i < NO_OF_EMP; i++) {
			ids[i] = scanner.nextLine();
			names[i] = scanner.nextLine();
			salary[i] = scanner.nextInt();
		}

		display(ids, names, salary);

	}

	static void display(String[] ids, String[] names, int[] salary) {
		for (int i = 0; i < NO_OF_EMP; i++) {
			System.out.println(ids[i]+" :" + names[i]+" : "+ salary[i]);
		}
	}
}
