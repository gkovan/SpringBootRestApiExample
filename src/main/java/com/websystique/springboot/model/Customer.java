package com.websystique.springboot.model;

public class Customer {
	
	private String firstname;
	private String lastname;
	private int age;
	
	public Customer(){}
	
	public Customer(String firstname, String lastname, int age){
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}
	
	public void setFirstname(String firstname){
		this.firstname = firstname;
	}
	
	public String getFirstname(){
		return this.firstname;
	}
	
	public void setLastname(String lastname){
		this.lastname = lastname;
	}
	
	public String getLastname(){
		return this.lastname;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return this.age;
	}
	
	@Override
	public String toString() {
		String info = String.format("Customer Info: firstname = %s, lastname = %s, age = %d", 
												firstname, lastname, age);
		return info;
	}
	

}
