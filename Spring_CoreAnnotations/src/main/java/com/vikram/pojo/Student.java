package com.vikram.pojo;

import org.springframework.beans.factory.annotation.Required;

public class Student {
private int sno;
private String sname;
public int getSno() {
	return sno;
}
public void setSno(int sno) {
	this.sno = sno;
}
public String getSname() {
	return sname;
}
@Required
public void setSname(String sname) {
	this.sname = sname;
}

}
