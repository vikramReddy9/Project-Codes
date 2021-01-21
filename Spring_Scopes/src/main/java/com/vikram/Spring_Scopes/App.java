package com.vikram.Spring_Scopes;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BeanFactory factory=new XmlBeanFactory(new ClassPathResource("spring.xml"));
   SpringBeans s=(SpringBeans) factory.getBean("sb");
   SpringBeans s1=(SpringBeans) factory.getBean("sb");
   SpringBeans s2=(SpringBeans) factory.getBean("sb");
   SpringBeans s3=(SpringBeans) factory.getBean("sb");
   System.out.println(s);
   System.out.println(s1);
   System.out.println(s2);
   System.out.println(s3);
   
    }
}
