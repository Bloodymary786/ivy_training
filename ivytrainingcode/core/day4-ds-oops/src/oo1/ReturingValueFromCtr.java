package oo1;

class Foo{
	
	public Foo() {
		System.out.println("it is a ctr");
	}
	public String Foo() {
		System.out.println("it is a method");
		return "raj";
	}
}

public interface ReturingValueFromCtr {
	
	public static void main(String[] args) {
		String val=new Foo().Foo();
		System.out.println(val);
		
	}

}
