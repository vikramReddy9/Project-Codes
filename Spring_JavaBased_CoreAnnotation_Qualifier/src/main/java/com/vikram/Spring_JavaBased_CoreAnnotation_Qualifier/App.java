package com.vikram.Spring_JavaBased_CoreAnnotation_Qualifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vikram.bean.SpringConfiguration;
import com.vikram.service.VehicleService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfiguration.class);
//        context.scan("com.vikram.bean");
//        context.scan("com.vikram.service");
        
        VehicleService vs=(VehicleService) context.getBean(com.vikram.service.VehicleService.class);
         vs.Service();
         context.close();
    }
}
