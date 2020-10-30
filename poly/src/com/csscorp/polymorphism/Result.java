package com.csscorp.polymorphism;

public class Result {
public static void main(String[] args) {
	Salary s = new Salary("Krithiga ","Chennai,1",2,500.00);
	Employee e =new Salary("Nandhini ","Ambur,2",1,300.00);
	System.out.println("Salary reference");
	s.mailcheck();
	System.out.println("Employee reference");
	e.mailcheck();
	
	
}
}
