package com.csscorp.polymorphism;

public class Employee {
	private String name;
	private String address;
	private int number;
	
	public Employee(String name,String address,int number) {
	
		System.out.println("Constructing an Employee");
		this.name=name;
		this.address=address;
		this.number=number;
	}

	
public void mailcheck() {
System.out.println("Mailing a check to" + this.name + " " +this.address);	
}
public String toString() {
	return name +" " + address + " " +number;
	
}
public String getName() {
	return name;
}
public String getaddress() {
	return address;
	}
public void setaddress(String newaddress) {
	address=newaddress;
}
public int getnumber() {
	return number;
}

}
	

