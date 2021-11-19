package basics_oo;
/*
 * use a: Passanger ----> Metro
 * when to go interface and then for Abstract class(Common base heriarcy )*
 */
abstract class Vehical{
	public abstract void move(String s, String d);
}
class Metro extends Vehical{
	public void move(String s, String d) {
		System.out.println("passanger is moving from "+ s + " to  destination "+ d+" using metro");
	}
}
class Car extends Vehical{
	public void move(String s, String d) {
		System.out.println("passanger is moving from "+ s + " to  destination "+ d+" using Car");
	}
}

class Bike extends Vehical{
	public void move(String s, String d) {
		System.out.println("passanger is moving from "+ s + " to  destination "+ d+" using bike");
	}
}

class Passanger {
	String name;
	
	 Passanger(String name) {
		this.name=name;
	}
	public void travel(String s, String d,Vehical vehical) {
		System.out.println("name of passanger ..."+name);
		vehical.move(s, d);
	}
}
public class DemoRelationshipBwObjects {

	public static void main(String[] args) {
		//Metro metro=new Metro();
		//Car car=new Car();
		//Vehical vehical =new Bike();
		Vehical vehical=new Bike();
		
		Passanger passanger=new Passanger("raj");
		passanger.travel("viman nager", "gandhi musium", vehical);
	}
}





