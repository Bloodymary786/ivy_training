package recursion;

public class FactorialEx {

	static long fact(long n) {
		if(n==0)
			return 1;
		else 
			return n * fact(n-1);
		
	}
	public static void main(String[] args) {
		
		long val= fact(5);
		
		System.out.println(val);
		
	}
}
