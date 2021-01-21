package com.vikram.DaoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.vikram.Dao.DeptDao;
import com.vikram.Pojo.Department;

@Repository
public class DeptDaoImpl implements DeptDao {

	
	@Autowired
	private JdbcTemplate jt;
	
	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public int createDept(Department d) {
		// TODO Auto-generated method stub	
		return jt.update("insert into Department values(?,?,?)", d.getDeptno(),d.getDname(),d.getLoc());
	}

	public void ChangeLocation(int deptno, String newLoc) {
		// TODO Auto-generated method stub
		jt.update("update Department set loc=? where deptno=?", new Object [] {newLoc,deptno});
		//jt.update("update Department set loc=? where deptno=?", newLoc,deptno);

	}

	public void ChangeDeptDetails(Department d) {
		// TODO Auto-generated method stub
    jt.update("update Department set dname=?,loc=? where deptno=?", d.getDname(),d.getLoc(),d.getDeptno());
	}

	public void remove(int deptno) {
		// TODO Auto-generated method stub
   jt.update("delete from Department where deptno="+deptno);
	}

}
