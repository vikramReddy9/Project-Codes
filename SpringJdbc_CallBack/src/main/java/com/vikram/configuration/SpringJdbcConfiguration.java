package com.vikram.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.vikram.Dao.DepartmentDao;

import com.vikram.DaoImpl.DepartmentDaoImpl;


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
	public JdbcTemplate jbdctemplate()
	{
		JdbcTemplate jt=new JdbcTemplate();
		jt.setDataSource(datasource());
		return jt;
	}
	
	@Bean
	public DepartmentDao deptno()
	{
		DepartmentDaoImpl daoimpl=new DepartmentDaoImpl();
		daoimpl.setJt(jbdctemplate());
		return daoimpl;
	}
}
