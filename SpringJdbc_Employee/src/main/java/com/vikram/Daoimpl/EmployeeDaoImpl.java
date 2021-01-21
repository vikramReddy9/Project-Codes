package com.vikram.Daoimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.vikram.Dao.EmployeeDao;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jt;
	
	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public int getDeptno(int eno) {
		// TODO Auto-generated method stub
		
		return (Integer)jt.queryForObject("select deptno from Employee where eno=?"+eno,Integer.class);
	}

	public String getName(int eno) {
		// TODO Auto-generated method stub
		return (String)jt.queryForObject("select ename from Employee where eno=?"+eno,String.class);
	}

	public double getSalary(int eno) {
		// TODO Auto-generated method stub
		return (Double)jt.queryForObject("select salary from Employee where eno=?" +eno, new Object[]{eno},Double.class);
	}

	public List getEmployeeDetails() {
		// TODO Auto-generated method stub
		return jt.queryForList("select eno,deptno,ename,esalary from Employee");
	}

	public Map getEmployeeDetails(int eno) {
		// TODO Auto-generated method stub
		return jt.queryForMap("select deptno,ename,esalary from Employee where eno=?",new Object[]{eno});
	}

}
