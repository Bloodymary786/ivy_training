package assignments_collection;
import java.util.*;
import java.util.Map.Entry;
/*
 * Write a program to write 5 employee records using HashMap and display them..
 */

class Employee{
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	//toString: Overriding*
	
	
	
}
public class Assignment2 {

	public static void main(String[] args) {
		Map<Integer, Employee> map=new HashMap<Integer, Employee>();
		map.put(1, new Employee(1, "raj", 790));
		map.put(2, new Employee(2, "ekta", 800));
		map.put(3, new Employee(3, "pankaj", 390));
		map.put(81, new Employee(81, "ravi", 496));
		map.put(3666, new Employee(3666, "ekta", 870));
		
		//now iterating it using entrySet (as entry set is m......)
		Set<Entry<Integer, Employee>> entrySet = map.entrySet();
		
		for(Entry<Integer, Employee> entry: entrySet) {
			System.out.println(entry.getKey() + " : "+ entry.getValue());
		}
		
	}
}




