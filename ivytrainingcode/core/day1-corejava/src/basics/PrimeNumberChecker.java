package basics;

import java.util.Scanner;

public class PrimeNumberChecker {

	public static void main(String[] args) {

		System.out.println("PE a no");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		if (isPrimeNumber(n))
			System.out.println("it is a prime no");
		else
			System.out.println("it is not a prime no");

		scanner.close();
	}

	public static boolean isPrimeNumber(int n) {
		boolean isPrime = true;
		for (int i = 2; i <= (n - 1); i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}
