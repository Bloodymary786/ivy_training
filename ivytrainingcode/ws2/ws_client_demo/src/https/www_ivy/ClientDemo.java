package https.www_ivy;

public class ClientDemo {

	public static void main(String[] args) {
		Calservice calservice=new Calservice();
		Calapp calapp=calservice.getMycalport();
		System.out.println(calapp.addMethod(2, 2));
	}
}
