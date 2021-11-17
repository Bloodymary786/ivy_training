package queue;
import java.util.*;

//Comparable and comparator

class StudentNameSorter implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}
	
}
class Student implements Comparable<Student>{
	int id;
	String name;
	int marks;
	
	Student(int myId, String myName, int myMarks){
		
		id=myId;
		name=myName;
		marks=myMarks;
	}
	void print() {
		System.out.println("student details : id: "+ id+" name: "+ name+" marks: "+ marks);
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
		return Integer.compare(o.marks, marks);
	}
	
	
	//u need to override equals() method ? hashcode() method
	
	
}
public class DemoPriorityQueueWithCustomData {
	//this code will not work : java.lang.ClassCastException
	public static void main(String[] args) {
		
		
		Student student1=new Student(12, "raj", 67);
		Student student2=new Student(2, "amit", 78);
		Student student3=new Student(192, "keshav", 88);
		Student student4=new Student(82, "pooja", 56);
		
		
		List<Student>list=new LinkedList<Student>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		
		System.out.println("-------------sorted as per marks (reverse sorting )---------------");
		Collections.sort(list);
		
		for(Student student: list) {
			student.print();
		}
		
		System.out.println("-------------sort as per name ------------------------------");
		
		Collections.sort(list, new StudentNameSorter());
		
		for(Student student: list) {
			student.print();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		///super() is a method call that is used to pass the paramter in the ctr call
		//---------------will cover it latter---------------
//		Student student1=new Student(12, "raj", 67);
//		Student student2=new Student(12, "raj", 67);
//		
//		//----how to compare 2 objects
//		
//		// == vs equals methods
//		if(student1.equals(student2)) {
//			System.out.println("students are same");
//		}else
//			System.out.println("students are not same");
		
		
		
		
		
		
		//student1.print();
//		Student student1=new Student(12, "raj", 67);
//		Student student2=new Student(2, "amit", 78);
//		Student student3=new Student(192, "keshav", 88);
//		Student student4=new Student(82, "pooja", 56);
//		
//		
//		PriorityQueue<Student> priorityQueue=new PriorityQueue<Student>();
//		
//		priorityQueue.offer(student1);
//		priorityQueue.offer(student2);
//		priorityQueue.offer(student3);
//		priorityQueue.offer(student4);
//		
//		//now i want to print all the details from this
//		
//		while(!priorityQueue.isEmpty()) {
//			Student student=priorityQueue.poll();
//			student.print();
//		}
//		
//		
		
		
	}
}





