package com.csscorp.polymorphism;

public class Salary extends Employee {
	private double salary;
	public Salary(String name,String address,int number,double salary) {
		super(name,address,number);
		setSalary(salary);
	}
	public void mailcheck() {
		System.out.println("mail check of salary class");
		System.out.println("check to"  + getName() + "with salary" + salary);
	}
	public double getSalary() {
		return salary;
	}
		public void setSalary(double newSalary) {
			if(newSalary >= 0.0) {
				salary = newSalary;
			}
		}

public double computePay() {
	System.out.println("Computing salary pay for"  + getName());
	return salary/52;
}
}
				
	


