package com.vikram.SpringJdbc_Account;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vikram.DaoImpl.AccountDaoImpl;
import com.vikram.configuration.SpringJdbcConfiguration;
import com.vikram.pojo.AccountVo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new  AnnotationConfigApplicationContext (SpringJdbcConfiguration.class );
    	AccountDaoImpl daoimpl=(AccountDaoImpl) context.getBean(AccountDaoImpl.class);
    	
    	System.out.println("----Insert001----");
    	AccountVo acc=new AccountVo(100,"vik",250000);
    	int count=daoimpl.insert001(acc);
    	if(count!=0)
    	{
    		System.out.println("no of rows inerted:"+count);
    	}
    	
    	System.out.println("---Insert002---");
    	 acc=new AccountVo(101,"nik",150000);
    	 count=daoimpl.insert001(acc);
    	if(count!=0)
    	{
    		System.out.println("no of rows inerted:"+count);
    	}
    	
    	
    }
}
