package com.vikram.Spring_Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
private int eno;
private String ename;
@Qualifier(value="address2")
@Autowired
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
