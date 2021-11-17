package hashing;
import java.util.*;
//HashSet: hashing concepts

//Rule : when u are using user define object inside hashSet then
//that object hashcode() must be define...

//it is GPP(good programming practice) to override equal and hashcode togather

class Key{
	int k;
	Key(int kVal){
		k=kVal;
	}
	public void print() {
		System.out.println(k);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + k;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		if (k != other.k)
			return false;
		return true;
	}
	
	
}
public class NeedOfHashing {

	public static void main(String[] args) {
		
//		HashSet<String> set=new HashSet<String>();
//		
//		set.add("raj");
//		
//		System.out.println(set.contains("raj"));// true, false?
		
		HashSet<Key> set=new HashSet<Key>();
		
		set.add(new Key(33));
		
		System.out.println(set.contains(new Key(33)));// true, false?
	}
}
