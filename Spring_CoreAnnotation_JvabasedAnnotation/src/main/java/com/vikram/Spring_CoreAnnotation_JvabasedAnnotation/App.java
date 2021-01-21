package com.vikram.Spring_CoreAnnotation_JvabasedAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.vikram.bean.HelloWorld;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context= new AnnotationConfigApplicationContext(com.vikram.Config.HelloWorldConfig.class);
 HelloWorld hello=(HelloWorld) context.getBean(com.vikram.bean.HelloWorld.class);
 //hello.setName("welcome to sarnia javabased annotation");
 System.out.println(hello.getName()); 
 System.out.println("=============");
 HelloWorld hello1=(HelloWorld) context.getBean(com.vikram.bean.HelloWorld.class);
 //hello.setName("welcome to sarnia javabased annotation");
 System.out.println(hello1.getName()); 
 System.out.println(hello.hashCode()); 
 System.out.println(hello1.hashCode()); 
 context.registerShutdownHook();
    
    }
}
