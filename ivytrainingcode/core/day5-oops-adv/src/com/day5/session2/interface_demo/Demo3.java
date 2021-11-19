package com.day5.session2.interface_demo;
interface Payable{
	public double getPay();
}
class Emp implements Payable{
	private int id;
	private String name;
	private double salary;
	
	public Emp(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public double getPay() {
		return salary-salary*20/100;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}

class Invoice  implements Payable {
	private String invoiceId;
	private int noOfDays;
	private double payoutPerDay;
	
	public double getPay() {
		return payoutPerDay*noOfDays;
	}
	
	public Invoice(String invoiceId, int noOfDays, double payoutPerDay) {
		super();
		this.invoiceId = invoiceId;
		this.noOfDays = noOfDays;
		this.payoutPerDay = payoutPerDay;
	}

	@Override
	public String toString() {
		return "Invoice [invoiceId=" + invoiceId + ", noOfDays=" + noOfDays + ", payoutPerDay=" + payoutPerDay + "]";
	}

}
class PaymentSystem{
	static void paymentProcessing(Payable payable) {
		//...
		System.out.println("payment is procesed");
		System.out.println(payable.getPay());
	}
}
public class Demo3 {

	public static void main(String[] args) {
		Invoice invoice=new Invoice("4334A", 10, 18);
		Emp emp=new Emp(43, "raj", 56);
		System.out.println("Paying for an regular emp");
		PaymentSystem.paymentProcessing(emp);
		System.out.println("Paying for an consultant");
		PaymentSystem.paymentProcessing(invoice);
	}
}




