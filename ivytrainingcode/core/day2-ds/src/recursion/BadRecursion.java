package recursion;
class Foo{
	void myFun() {
		System.out.println("it is myfun");
		myFun();
	}
}
public class BadRecursion {

	public static void main(String[] args) {
		
		Foo f=new Foo();
		f.myFun();
	}
}
