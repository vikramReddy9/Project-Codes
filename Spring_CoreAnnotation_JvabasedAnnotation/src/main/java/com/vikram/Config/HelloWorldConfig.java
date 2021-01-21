package com.vikram.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.vikram.bean.HelloWorld;

@Configuration
public class HelloWorldConfig {
	
    @Bean()
    @Scope(scopeName="prototype")
	public HelloWorld sayHello()
	{
		HelloWorld hello=new HelloWorld();
		hello.setName("welcome to sarnia javabased annotation");
		return hello;
			
	}
    
    
	
}
