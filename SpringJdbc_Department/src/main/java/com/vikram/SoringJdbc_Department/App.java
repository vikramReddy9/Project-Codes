package com.vikram.SoringJdbc_Department;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vikram.DaoImpl.DeptDaoImpl;
import com.vikram.Pojo.Department;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        DeptDaoImpl daoimpl=(DeptDaoImpl) context.getBean("deptDao");
/*       Department d= new Department();
        d.setDeptno(101);
        d.setDname("It");
        d.setLoc("canada");
       int count= daoimpl.createDept(d);
     if(count!=0)
     {
    	 System.out.println("data inserted sucessfully");
     }
   	 else
    	 {
    	System.out.println("data not inserted sucessfully");
     }
*/  
        //daoimpl.remove(100);
    }
}
