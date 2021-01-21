package com.vikram.Dao;

import com.vikram.Pojo.Department;

public interface DeptDao {
int createDept(Department d);
void ChangeLocation(int deptno, String newLoc);
void ChangeDeptDetails(Department d);
void remove(int deptno);
}
