package abstract_class_mcq;
abstract class A{
	void foo() {
		System.out.println("it is a foo method of A class");
	}
}
abstract class B{
	void foo() {
		System.out.println("it is a foo method of B class");
	}
}
 class C extends A, B{
	 
	void foo() {
		super.foo();
		System.out.println("it is a foo method of A class");
	}
}
public class DemoDoubts2 {
	public static void main(String[] args) {

	}
}
