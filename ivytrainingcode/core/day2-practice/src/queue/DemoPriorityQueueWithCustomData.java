package queue;

import java.util.PriorityQueue;

class Student {
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
}

public class DemoPriorityQueueWithCustomData {
	// this code will not work : java.lang.ClassCastException
	public static void main(String[] args) {
		Student student1 = new Student(12, "raj", 67);

		Student student2 = new Student(2, "amit", 78);
		Student student3 = new Student(192, "keshav", 88);
		Student student4 = new Student(82, "pooja", 56);

		PriorityQueue<Student> priorityQueue = new PriorityQueue<Student>();

		priorityQueue.offer(student1);
		priorityQueue.offer(student2);
		priorityQueue.offer(student3);
		priorityQueue.offer(student4);

		// now i want to print all the details from this

		while (!priorityQueue.isEmpty()) {
			Student student = priorityQueue.poll();
			student.print();
		}

	}
}
