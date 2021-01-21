package com.vikram.Dao;

import com.vikram.pojo.AccountVo;

public interface AccountDao {
public int insert001(AccountVo acc);
public int insert002(AccountVo acc);
public int update(AccountVo acc);
public int delete(int acno);
}
