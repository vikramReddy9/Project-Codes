package com.vikram.Spring_CoreAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vikram.pojo.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
      Student sb=(Student)  context.getBean("sb");
      System.out.println(sb.getSno()+"\t"+sb.getSname());
    }
}
