package com.vikram.SpringJdbc_Employee;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vikram.Daoimpl.EmployeeDaoImpl;
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
    	EmployeeDaoImpl daoimpl=(EmployeeDaoImpl) context.getBean(EmployeeDaoImpl.class);
    	int deptno=daoimpl.getDeptno(100);
    	System.out.println("Dept Number:"+deptno);
    	String ename=daoimpl.getName(100);
    	System.out.println("Employee name :"+ename);
    	double esalary=daoimpl.getSalary(100);
    	System.out.println("Employee Salary:"+esalary);
    	List<Map> edetails=(List<Map>)daoimpl.getEmployeeDetails();
    	for(Map emp:edetails)
    	{
    		System.out.println(emp.get("eno")+"\t"+emp.get("ename")+"\t"+emp.get("deptno")+"\t"+emp.get("esalary"));
    	}
  Map Edetails=daoimpl.getEmployeeDetails(100);
 Set<String>keys= Edetails.keySet();
 for(String key:keys)
 {
	System.out.println(key+"\t"+Edetails.get(key)); 
 }
  
    }
}
