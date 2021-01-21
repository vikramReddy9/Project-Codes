package com.vikram.DaoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.vikram.Dao.DepartmentDao;
import com.vikram.Pojo.Department;

@Repository
public class DepartmentDaoImpl implements DepartmentDao {
	
 @Autowired
 private JdbcTemplate jt;
 
	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public String getDepartmentName(int deptno) {
		// TODO Auto-generated method stub
		return (String) jt.query("select dname from Department where deptno="+deptno, new ResultSetExtractor()
				{

					public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
						// TODO Auto-generated method stub
						if(rs.next())
							return rs.getString(1);
							else
						return null;
					}
			
			}
				);
	}

	public Department getDepartmentDetails(int deptno) {
		// TODO Auto-generated method stub
		final Department d=new Department();
		 jt.query("select * from Department where deptno="+deptno, new RowCallbackHandler()
				{

					public void processRow(ResultSet rs) throws SQLException {
						// TODO Auto-generated method stub
						d.setDeptno(rs.getInt(1));
						d.setDname(rs.getString(2));
						d.setLoc(rs.getString(3)); 
					}
			    
				}
				);
		 return d;
	}

	public List<Department> getAllDepartments() {
		// TODO Auto-generated method stub
		DepartmentMapper dm=new DepartmentMapper();
		return jt.query("select * from Department",dm);
	}
	

}
