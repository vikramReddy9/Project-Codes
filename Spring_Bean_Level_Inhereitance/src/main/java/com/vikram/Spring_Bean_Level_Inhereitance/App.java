package com.vikram.Spring_Bean_Level_Inhereitance;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.vikram.pojo.Child;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BeanFactory factory= new XmlBeanFactory(new ClassPathResource("/spring.xml"));
        Child c=(Child) factory.getBean("child");
  System.out.println(c.getMoney()+"\t"+c.getDocuments()+"\t"+c.getDiseases()+"\t"+c.getKnowledge()+"\t"+c.getBadhabits());	
    
    }
}
