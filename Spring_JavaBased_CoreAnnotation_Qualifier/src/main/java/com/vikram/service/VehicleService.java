package com.vikram.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.vikram.bean.Vehicle;
@Component
public class VehicleService {

	@Autowired
	@Qualifier("car bean")
	private Vehicle motor;
	
	public void Service()
	{
	 motor.start();
	 motor.stop();
		
	}
}
