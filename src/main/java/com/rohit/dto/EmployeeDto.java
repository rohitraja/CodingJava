package com.rohit.dto;

public class EmployeeDto /*implements Comparable<EmployeeDto>*/ {
	
	private Integer age;
	private String name;
	
	
	public EmployeeDto(Integer age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
/*	@Override
	public int compareTo(EmployeeDto o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.getName());
	}
	*/
	

}
