package com.vikram.Dao;

import java.util.List;
import java.util.Map;

public interface EmployeeDao {
int getDeptno(int eno);
String getName(int eno);
double getSalary(int eno);
List getEmployeeDetails();
Map getEmployeeDetails(int eno);
}
