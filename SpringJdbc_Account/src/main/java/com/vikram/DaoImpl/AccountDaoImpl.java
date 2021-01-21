package com.vikram.DaoImpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.vikram.Dao.AccountDao;
import com.vikram.Query.QueryConstants;
import com.vikram.pojo.AccountVo;

@Repository
public class AccountDaoImpl implements AccountDao {
	
	@Autowired
	private NamedParameterJdbcTemplate jt;
	
	public NamedParameterJdbcTemplate getJt() {
		return jt;
	}

	public void setJt(NamedParameterJdbcTemplate jt) {
		this.jt = jt;
	}

	public int insert001(AccountVo acc) {
		// TODO Auto-generated method stub
		Map<String,Object>namedparams=new HashMap<String,Object>();
		namedparams.put("no", acc.getAcno());
		namedparams.put("bal", acc.getBal());
		namedparams.put("name", acc.getName());
		return jt.update(QueryConstants.INSER_QUERY, namedparams);
	}

	public int insert002(AccountVo acc) {
		// TODO Auto-generated method stub
		Map<String,Object>namedparams=new HashMap<String,Object>();
		namedparams.put("no", acc.getAcno());
		namedparams.put("bal", acc.getBal());
		namedparams.put("name", acc.getName());
		SqlParameterSource ps=new MapSqlParameterSource(namedparams);
		return jt.update(QueryConstants.INSER_QUERY, ps);
	
	}

	public int update(AccountVo acc) {
		// TODO Auto-generated method stub
		//SqlParameterSource ps=new BeanPropertySqlParameterSource(acc);
		AccountVo acc1 = new AccountVo();
		return jt.update(QueryConstants.UPDATE_QUERY, (SqlParameterSource) acc1) ; 
	}

	public int delete(int acno) {
		// TODO Auto-generated method stub
		SqlParameterSource ps=new MapSqlParameterSource("no",acno);
		return jt.update(QueryConstants.DELETE_QUERY,ps);
	}

}
