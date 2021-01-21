package com.vikram.Spring_ListObject_Injecting;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.vikram.pojo.College;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	BeanFactory factory=new XmlBeanFactory(new ClassPathResource("spring.xml"));
        College col=(College) factory.getBean("col");
        col.display();
    }
}
