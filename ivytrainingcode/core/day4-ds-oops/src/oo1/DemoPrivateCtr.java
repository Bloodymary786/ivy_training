package oo1;
//	Singleton Design pattern use concept of private ctr
class MyClass{
	private static MyClass class1=new MyClass();
	
	private MyClass() {
		System.out.println("dare to call me");
	}
	public static MyClass geMyClass() {
		return class1;
	}
}
public class DemoPrivateCtr {

	public static void main(String[] args) {
		
		MyClass class1=MyClass.geMyClass();
		
	}
}
