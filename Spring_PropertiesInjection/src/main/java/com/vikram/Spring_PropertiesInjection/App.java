package com.vikram.Spring_PropertiesInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.vikram.pojo.DataBaseProp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BeanFactory factory=new XmlBeanFactory(new ClassPathResource("spring.xml"));
        DataBaseProp ibrf=(DataBaseProp) factory.getBean("ibrf");
        ibrf.display();
    }
}
