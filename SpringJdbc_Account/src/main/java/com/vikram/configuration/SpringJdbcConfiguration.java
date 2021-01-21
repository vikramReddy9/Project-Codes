package com.vikram.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.vikram.Dao.AccountDao;
import com.vikram.DaoImpl.AccountDaoImpl;


@Configuration
public class SpringJdbcConfiguration {
 
	@Bean
	public DataSource datasource()
	{
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		ds.setUsername("system");
		ds.setPassword("root");
		return ds;
	}
	@Bean
	public NamedParameterJdbcTemplate jbdctemplate()
	{
		NamedParameterJdbcTemplate jt=new NamedParameterJdbcTemplate(datasource());
		return jt;
	}
	
	@Bean
	public AccountDao accountdao()
	{
		AccountDaoImpl daoimpl=new AccountDaoImpl();
		//daoimpl.setJt(jbdctemplate()); 
		return daoimpl;
	}
}
