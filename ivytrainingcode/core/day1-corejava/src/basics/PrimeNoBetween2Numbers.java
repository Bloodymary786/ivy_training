package basics;

import java.util.Scanner;

public class PrimeNoBetween2Numbers {
	
	public static void main(String[] args) {
		System.out.println("PE 2 nos ");
		int n1, n2;
		Scanner scanner = new Scanner(System.in);
		 n1 = scanner.nextInt();
		 n2 = scanner.nextInt();
		
		 int counter=noOfPrimeNoBetweenTwoNumbers(n1, n2);
		 System.out.println("count of prime nos: "+ counter);
		 
		 scanner.close();
		 
	}

	private static int noOfPrimeNoBetweenTwoNumbers(int n1, int n2) {
		int counter=0;
		for(int i=n1; i<=n2; i++) {
			if(isPrimeNumber(i)) {
			//	System.out.println(i);
				counter++;
			}
		}
		return counter;
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
