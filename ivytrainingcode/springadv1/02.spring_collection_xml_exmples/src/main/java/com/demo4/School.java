package com.demo4;

import java.util.*;
import java.util.Map.Entry;

public class School {

	private String schoolName;
	private Map<String, Teacher> teachers;

	public void printSchoolDetails() {
		System.out.println("school name: " + schoolName);
		System.out.println("our teachers details: ");

		Set<Entry<String, Teacher>> entrySet = teachers.entrySet();

		for (Entry<String, Teacher> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public void setTeachers(Map<String, Teacher> teachers) {
		this.teachers = teachers;
	}

}
