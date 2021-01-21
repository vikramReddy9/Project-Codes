package com.vikram.Spring_BeanAlias;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.vikram.pojo.GreetinBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BeanFactory factory=new XmlBeanFactory(new ClassPathResource("spring.xml"));
        GreetinBean gb=(GreetinBean)factory.getBean("gb2");
   System.out.println(gb.getName());
   
  String[] alias= factory.getAliases("gb");
  
  for(String s:alias)
  {
	  System.out.println(s);
  }
    
    }
}
