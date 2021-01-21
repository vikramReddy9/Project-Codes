package com.vikram.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bike bean")
public class Bike implements Vehicle {

	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Bike started");
	}

	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Bike stopped");
	}

}
