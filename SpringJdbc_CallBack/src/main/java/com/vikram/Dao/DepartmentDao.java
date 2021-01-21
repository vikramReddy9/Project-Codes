package com.vikram.Dao;

import java.util.List;

import com.vikram.Pojo.Department;

public interface DepartmentDao {
String getDepartmentName(int deptno);
Department getDepartmentDetails(int deptno);
List<Department> getAllDepartments();	
}
