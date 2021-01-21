package com.vikram.pojo;

public class AccountVo {
private int acno;
private String name;
private double bal;
public AccountVo(int acno, String name, double bal) {
	super();
	this.acno = acno;
	this.name = name;
	this.bal = bal;
}
public AccountVo() {
	super();
	// TODO Auto-generated constructor stub
}
public int getAcno() {
	return acno;
}
public void setAcno(int acno) {
	this.acno = acno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getBal() {
	return bal;
}
public void setBal(double bal) {
	this.bal = bal;
}

}
