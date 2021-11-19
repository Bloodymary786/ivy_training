package com.day5.session2.excption_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WhyWeNeedExHanding {

	public static void main(String[] args) {
		// exception handlilng make our code "robust"
		Scanner scanner = null;
		try {
			System.out.println("PE two numbers");
			scanner = new Scanner(System.in);

			int x = scanner.nextInt();
			int y = scanner.nextInt();
			int z = x / y;
			System.out.println(z);

		} catch (InputMismatchException | ArithmeticException ex) {
			System.out.println("invalid input");

		}  catch (Exception ex) {
			System.out.println("some ex happens");

		}

		finally {
			scanner.close();
		}

		System.out.println("-----------------");
	}
}
