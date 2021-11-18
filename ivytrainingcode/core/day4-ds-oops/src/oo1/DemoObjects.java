package oo1;
//basics of object , class ctr , getter setter , static 

// data + method 
//static *

class Account {
	int id; 
	String name;
	double balance;
	
	static String bankName="sbi bank";
	
	Account() {}
	
	Account(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public void print() {
		System.out.println("id: " + id + " name: " + name + " balance: " + balance);
	}

	//what is static method ?
	public static String getBankName() {
		return bankName;
	}
}

public class DemoObjects {

	public static void main(String[] args) {

		Account account = new Account(3,"ravi",70);
		Account account2 = new Account(5,"raj",90);
		//System.out.println(account.getBankName());	bad code
		System.out.println(Account.getBankName());
		
	}
}




/*
 * 
class Account {
	int id; // instance variable
	String name;
	double balance;

	// def ctr
	// DRY
	//init block
	
	{
		System.out.println("---common code-------------");
	}
	{
		System.out.println("---common code 2-------------");
	}
	static {
		System.out.println(" i am static init block");
	}
	Account() {
		// this(2,"foo",700);// ctr chaining
	}
	// para ctr

	Account(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public void print() {
		System.out.println("id: " + id + " name: " + name + " balance: " + balance);
	}

}
*/
