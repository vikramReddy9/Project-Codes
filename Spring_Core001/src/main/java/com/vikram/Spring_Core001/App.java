package com.vikram.Spring_Core001;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.vikram.pojo.Welcome;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // Instantiate Spring Core container 
    	BeanFactory factory=new XmlBeanFactory(new ClassPathResource("spring.xml")); 
        Welcome we=(Welcome)factory.getBean("Hello");
        System.out.println(we.getMessage());
        
    }
}
