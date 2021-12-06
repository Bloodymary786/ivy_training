package com.empapp.model.forms;

import org.apache.struts.action.ActionForm;

public class EmployeeForm extends ActionForm{
	private static final long serialVersionUID = -3550548479495412374L;
	
	private int id;
	private String name;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public EmployeeForm(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public EmployeeForm() {}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public EmployeeForm(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	
	
}
