package mcq;
import java.util.*;
//Generics java 1.5=> type safty to the data*
class Dog implements Comparable<Dog>{
	 int rank;
	 Dog(int myRank){
		 rank=myRank;
	 }
	void print() {
		System.out.println(rank);
	}
	@Override
	public int compareTo(Dog o) {
		return Integer.compare(rank, o.rank);
	}
}
public class DemoMCQ2 {

	public static void main(String[] args) {
		TreeSet<Dog> set=new TreeSet<>();//java 1.7
		set.add(new Dog(9));
		set.add(new Dog(8));
		set.add(new Dog(4));
		set.add(new Dog(1));
		
		for(Dog dog:set) {
			dog.print();
		}
		
	}
}
