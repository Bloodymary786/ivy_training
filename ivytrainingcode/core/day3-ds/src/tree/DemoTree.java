package tree;

import java.util.*;

//u need to careful if u are putting object of user define class inside the treeSet
//user define object must use "compable or comparator"

//Comparable vs Comparator

class StudentNameSorter implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		int val = o1.name.compareTo(o2.name);
		if (val == 0) {
			return Integer.compare(o2.marks, o2.marks);
		}
		return val;
	}

}

class Student implements Comparable<Student> {
	int id;
	String name;
	int marks;

	Student(int myId, String myName, int myMarks) {

		id = myId;
		name = myName;
		marks = myMarks;
	}

	void print() {
		System.out.println("student details : id: " + id + " name: " + name + " marks: " + marks);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + marks;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (marks != other.marks)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Student o) {
		return Integer.compare(id, o.id);
	}

}

public class DemoTree {

	public static void main(String[] args) {
		TreeSet<Student> set = new TreeSet<Student>(new StudentNameSorter());
		// whenever u are adding objects to TreeSet the objects should be compatable to
		// each oter
		// apple and orange in same tree
		set.add(new Student(121, "raj", 89));
		set.add(new Student(158, "raj", 56));
		set.add(new Student(11, "ekta", 59));
		set.add(new Student(91, "kapil", 97));

		for (Student student : set) {
			student.print();
		}
	}
}
