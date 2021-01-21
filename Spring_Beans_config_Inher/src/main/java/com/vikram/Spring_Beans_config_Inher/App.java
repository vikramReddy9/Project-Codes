package com.vikram.Spring_Beans_config_Inher;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.vikram.pojo.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BeanFactory factory=new XmlBeanFactory(new ClassPathResource("/spring.xml"));
        Employee e=(Employee)factory.getBean("emp");
        	e.displayDetails();
        	System.out.println("============");
        	Employee e1=(Employee)factory.getBean("emp1");
        	e1.displayDetails();
        	System.out.println("============");
        	Employee e2=(Employee)factory.getBean("emp2");
        	e2.displayDetails();
        	
    }
}
