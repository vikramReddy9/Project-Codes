package com.vikram.Spring_CoreAnnotation_CallBack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
       HelloWorld hw=(HelloWorld) context.getBean("Hello");
       System.out.println(hw.getMessage());
       context.registerShutdownHook();
    }
}
