package practice1;
import java.util.*;

//1. define comparator

class ProductSorterAsPerName implements Comparator<Product>{
	@Override
	public int compare(Product o1, Product o2) {
		return o1.name.compareTo(o2.name);
	}
	
}

//using comparable
class Product implements Comparable<Product> {
	int id;
	String name;
	double price;
	
	Product(int id1, String name1, double price1){
		id=id1;
		name=name1;
		price=price1;
	}
	void print() {
		System.out.println("product details are : id "+ id + " name : "+ name + " price: "+ price);
	}
	@Override
	public int compareTo(Product o) {
		return Double.compare(o.price, price);
	}
}
public class DemoPriorityQueue {

	public static void main(String[] args) {
		//2 . use comparator ie pass it inside the ctr call of PriorityQueue
		PriorityQueue<Product>que=new PriorityQueue<Product>(new ProductSorterAsPerName());
		que.offer(new Product(2, "laptop", 67000));
		que.offer(new Product(52, "wireless mouse", 1200));
		que.offer(new Product(2, "keyboard", 600));
		que.offer(new Product(2, "water bottle", 900));
		
		
		//now try to print all products
		
		while(!que.isEmpty()) {
			Product product=que.poll();
			product.print();
		}
		
		//how to implements compareable and comparator
	}
}








