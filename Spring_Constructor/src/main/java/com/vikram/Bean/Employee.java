package com.vikram.Bean;

public class Employee {
private int eno;
private String name;
private double salary;
private String designation;



public Employee(int eno, String name, double salary, String designation) {
	super();
	this.eno = eno;
	this.name = name;
	this.salary = salary;
	this.designation = designation;
}



public Employee(int eno, String name) {
	super();
	this.eno = eno;
	this.name = name;
}



public Employee(double salary, String designation) {
	super();
	this.salary = salary;
	this.designation = designation;
}



public void display()
{
	System.out.println(eno+"\t"+name+"\t"+salary+"\t"+designation);
}

}
