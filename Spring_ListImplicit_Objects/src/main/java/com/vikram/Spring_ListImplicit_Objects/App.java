package com.vikram.Spring_ListImplicit_Objects;

import java.io.IOException;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.vikram.pojo.InstituteBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
		
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("spring.xml"));
        InstituteBean ins=(InstituteBean) factory.getBean("ins");
        ins.displayDetails();
        
    }
}
