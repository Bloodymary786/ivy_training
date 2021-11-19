package a.b;
//the scope of this class is package level
public class A {
	private int i=7;
	int j=77;
	public int k=9;
	
	protected void foo1() {
		System.out.println("protected method ....");
	}
	 void foo2() {
		System.out.println("default method ....");
	}
}
