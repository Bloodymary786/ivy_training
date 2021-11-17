package string_demo;

public class DemoCommandLineArg {

	public static void main(String[] args) {
		int sum=0;
		for(String temp: args) {
			sum+=Integer.parseInt(temp);
		}
		System.out.println(sum);
	}
}
