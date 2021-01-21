package com.vikram.Spring_Autowiring;

public class Employee {
private int eno;
private String ename;
private Address address;



public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public Employee(int eno, String ename, Address address) {
	super();
	this.eno = eno;
	this.ename = ename;
	this.address = address;
}

public int getEno() {
	return eno;
}

public void setEno(int eno) {
	this.eno = eno;
}

public String getEname() {
	return ename;
}

public void setEname(String ename) {
	this.ename = ename;
}

public void display()
{
System.out.println(eno+"\t"+ename+"\t"+address.getHno()+"\t"+address.getCity());
}
}
