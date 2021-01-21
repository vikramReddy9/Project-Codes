package com.vikram.pojo;

import java.util.Iterator;
import java.util.List;

public class College {
private String name;
List<Student> students;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Student> getStudents() {
	return students;
}
public void setStudents(List<Student> students) {
	this.students = students;
}
public void display()
{
	System.out.println("college name:"+name);
	System.out.println("students details");
	Iterator<Student>it=students.iterator();
	while(it.hasNext())
	{
		Student s=it.next();
		System.out.println(s.getSno());
		System.out.println(s.getSname());
		System.out.println(s.getSfee());
	}
}
}
