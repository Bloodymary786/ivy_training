package inheritance;

class A{
	int i;
	A(int i){
		this.i=i;
	}
	public void printI() {
		System.out.println("value of i: "+ i);
	}
}
class B extends A{
	int j;
	B(int i, int j){
		super(i);
		this.j=j;
	}
	// inheritance provide code resusablity?
	public void printJ() {
		super.printI();
		System.out.println("value of j: "+ j);
	}
}

class C extends B{
	int k;
	C(int i, int j, int k){
		super(i, j);
		this.k=k;
	}
	// inheritance provide code resusablity?
	public void printK() {
		super.printJ();
		System.out.println("value of k: "+ k);
	}
}

public class DemoInher {

	public static void main(String[] args) {
		//A a=new A(5);
		//B b=new B(2,5);
		C c=new C(2,4,5);
		c.printK();
	}
}
