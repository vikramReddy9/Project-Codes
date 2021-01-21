package com.vikram.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("car bean")
public class Car implements Vehicle {

	public void start() {
		// TODO Auto-generated method stub
System.out.println("car started");
	}

	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("car stopped");
	}

}
