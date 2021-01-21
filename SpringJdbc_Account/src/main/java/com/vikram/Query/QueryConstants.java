package com.vikram.Query;

public interface QueryConstants {
	
public static String UPDATE_QUERY="update Account set name=:name,bal=:bal where acno=:no";
public static String INSER_QUERY="insert into Account values(:no,:name,:bal)";
public static String DELETE_QUERY="delete from Account where acno=:no";
}
