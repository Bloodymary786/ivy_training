package basics;

import java.util.Scanner;

public class PrimeNumberChecker2 {

	public static void main(String[] args) {

		System.out.println("PE a no");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		isPrimeNumber(n);

		scanner.close();
	}

	public static void isPrimeNumber(int n) {
		boolean isPrime = true;
		if (n < 0) {
			System.out.println("invalid input");
		} else {
			for (int i = 2; i <= (n - 1); i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime)
				System.out.println("it is a prime no");
			else
				System.out.println("it is not a prime no");

		}
	}
}
