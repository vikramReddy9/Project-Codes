package com.vikram.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloWorld {
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public HelloWorld() {
	super();
	// TODO Auto-generated constructor stub
	System.out.println("Welcome to JavaBased Annotation");
}
@PostConstruct
public void init()
{
	System.out.println("intialized");
}
@PreDestroy
public void destroy()
{
	System.out.println("destroyerd");
}
}
