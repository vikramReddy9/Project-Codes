package com.vikram.SpringJdbc_CallBack;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vikram.DaoImpl.DepartmentDaoImpl;
import com.vikram.Pojo.Department;
import com.vikram.configuration.SpringJdbcConfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new  AnnotationConfigApplicationContext (SpringJdbcConfiguration.class );
		 DepartmentDaoImpl daoimpl=(DepartmentDaoImpl) context.getBean(DepartmentDaoImpl.class);
		String dname=daoimpl.getDepartmentName(101);
		System.out.println("Department Name:"+dname);
	Department d=daoimpl.getDepartmentDetails(101);
	if(d!=null)
	{
	System.out.println(d.getDeptno()+"\t"+d.getDname()+"\t"+d.getLoc());	
	}
	else
	{
		System.out.println("Department Details are not available");
	}
		
	List<Department>DeptDetails=daoimpl.getAllDepartments();
	for(Department dep:DeptDetails)
	{
		System.out.println(dep.getDeptno()+"\t"+dep.getDname()+"\t"+dep.getLoc());
	}
	
    }
 
}
