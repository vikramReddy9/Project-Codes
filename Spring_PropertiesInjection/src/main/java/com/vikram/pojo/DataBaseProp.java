package com.vikram.pojo;

import java.util.Enumeration;
import java.util.Properties;

public class DataBaseProp {
private Properties dbproperties;

public Properties getDbproperties() {
	return dbproperties;
}

public void setDbproperties(Properties dbproperties) {
	this.dbproperties = dbproperties;
}
public void display()
{
	Enumeration en=dbproperties.keys();
	while(en.hasMoreElements())
	{
		String id=(String) en.nextElement();
		String name=dbproperties.getProperty(id);
		System.out.println(id+"===="+name);
	}
	
}
}
