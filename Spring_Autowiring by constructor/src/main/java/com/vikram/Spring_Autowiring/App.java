package com.vikram.Spring_Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("/spring.xml");
       Employee emp=(Employee) context.getBean("emp");
       emp.display();
    }
}
