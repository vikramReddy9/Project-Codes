package com.vikram.SoringJdbc_Department;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vikram.DaoImpl.DeptDaoImpl;
import com.vikram.Pojo.Department;
import com.vikram.configuration.SpringJdbcConfiguration;

public class AnnotatedClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AnnotationConfigApplicationContext context = new  AnnotationConfigApplicationContext (SpringJdbcConfiguration.class );
		 DeptDaoImpl daoimpl=(DeptDaoImpl) context.getBean(DeptDaoImpl.class);
		 Department d= new Department();
	        d.setDeptno(103);
	        d.setDname("IIt");
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
	}

}
