package sll;
import java.util.*;
/*
 * visiblity modifier:
 * class : public , default(package level)
 * data/method : public , protected, defulat , private 
 */
class Emp{
	int id;
	String name;
	int salary;
	public Emp(int myId, String myName, int mySal) {
		id=myId;
		name=myName;
		salary=mySal;
		
	}
	public void print() {
		System.out.println("Emp info is : "+ id + " name : "+ name + " salary : "+ salary);
	}
}
public class ALWithUserDefineObject {
	
	public static void main(String[] args) {
		
		List<Emp> list1=new LinkedList<>();
		list1.add(new Emp(1, "raj", 67));
		list1.add(new Emp(8, "ekta", 56));
		list1.add(new Emp(78, "shraddha", 90));
		list1.add(new Emp(101, "gunika", 97));
		
		printEmps(list1);
		//sorting
		//We will cover how to handle this after covering then :
		
		//Comparable and Comparator
		
		//Collections.sort(list1);//Why?
	}

	 static void printEmps(List<Emp> list1) {
		for(Emp emp: list1) {
			emp.print();
		}
	}

}





