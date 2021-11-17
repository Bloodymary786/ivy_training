package recursion;
//how it works?
public class SumNumbersUsingRec {

	static int sum(int n) {
		if(n==1)
			return 1;
		else
			return n+ sum(n-1);
	}
	public static void main(String[] args) {
		int val= sum(10);
		System.out.println(val);
	}
}
