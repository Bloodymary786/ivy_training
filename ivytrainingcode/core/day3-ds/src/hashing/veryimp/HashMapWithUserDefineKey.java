package hashing.veryimp;
import java.util.*;
class Key {
	int k;

	Key(int kVal) {
		k = kVal;
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

public class HashMapWithUserDefineKey {

	public static void main(String[] args) {
		Map<Key, String> map=new HashMap<Key, String>();
		map.put(new Key(55), "55 value");
		map.put(new Key(55), "55 new value");
		
		String value= map.get(new Key(55));
		//IF U ARE USING ANY DS IN JAVA WHICH IS INTERNALLY BASED ON HASHING THEN DONT FORGET TO 
		// OVERRIDE hashcode method ...
		System.out.println(value);
		
	}
}
