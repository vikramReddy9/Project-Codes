package com.vikram.Spring_Autowiring;

public class Employee {
private int eno;
private String ename;
private Address address;
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
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}

public void display()
{
System.out.println(eno+"\t"+ename+"\t"+address.getHno()+"\t"+address.getCity());
}
}
