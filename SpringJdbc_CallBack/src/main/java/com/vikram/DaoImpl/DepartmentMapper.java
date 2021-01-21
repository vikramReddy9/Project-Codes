package com.vikram.DaoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.vikram.Pojo.Department;

public class DepartmentMapper implements RowMapper {

	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Department d1=new Department();
		d1.setDeptno(rs.getInt(1));
		d1.setDname(rs.getString(2));
		d1.setLoc(rs.getString(3));
		return d1;
	}

}
