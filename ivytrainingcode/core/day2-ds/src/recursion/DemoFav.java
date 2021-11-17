package recursion;

public class DemoFav {

	//nth term : 5
	static int fab(int n) {
		if(n==0 || n==1) {
			return n;
		}else {
			return fab(n-1)+ fab(n-2);
		}
	}
	// 1 1 2 3 5.....fibonacci series? using recursion?
	public static void main(String[] args) {
		// 1, 1, 2, 3, 5, 8, 13, 21....
		int sum= fab(8);
		System.out.println(sum);
	}
}
