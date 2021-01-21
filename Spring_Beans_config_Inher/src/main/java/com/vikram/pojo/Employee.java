package com.vikram.pojo;

public class Employee {
private int eno;	
private String ename;
private double salary;
private String Design;
private String city;
private String hno;
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
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getDesign() {
	return Design;
}
public void setDesign(String design) {
	Design = design;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getHno() {
	return hno;
}
public void setHno(String hno) {
	this.hno = hno;
}

public void displayDetails()
{
	System.out.println(eno);
	System.out.println(ename);
	System.out.println(salary);
	System.out.println(Design);
	System.out.println(city);
	System.out.println(hno);
}


}
