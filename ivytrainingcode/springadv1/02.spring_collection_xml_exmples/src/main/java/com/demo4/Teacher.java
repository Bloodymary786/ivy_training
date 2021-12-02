package com.demo4;

public class Teacher {

	private String name;
	private String qualification;
	private int rating;// 10 is highest 1 is lowest
	private boolean isEffectiveTeacher;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public boolean isEffectiveTeacher() {
		return isEffectiveTeacher;
	}
	public void setEffectiveTeacher(boolean isEffectiveTeacher) {
		this.isEffectiveTeacher = isEffectiveTeacher;
	}
	
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", qualification=" + qualification + ", rating=" + rating
				+ ", isEffectiveTeacher=" + isEffectiveTeacher + "]";
	}
	
}
