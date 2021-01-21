package com.vikram.pojo;

import java.util.List;

public class InstituteBean {
private String name;
private List<String> coursename;
private List<String> facultyname;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getCoursename() {
	return coursename;
}
public void setCoursename(List<String> coursename) {
	this.coursename = coursename;
}
public List<String> getFacultyname() {
	return facultyname;
}
public void setFacultyname(List<String> facultyname) {
	this.facultyname = facultyname;
}
public void displayDetails()
{
	System.out.println("InstituteName:"+name);
	System.out.println("FacultyNames :");
	for(String FN: facultyname)
	{
		System.out.println(FN);
	}
	System.out.println("===========================");
	System.out.println("CourseNames :");
	for(String CN: coursename)
	{
		System.out.println(CN);
	}
}
}
