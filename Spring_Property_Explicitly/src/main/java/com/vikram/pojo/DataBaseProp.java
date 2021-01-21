package com.vikram.pojo;

import java.util.Properties;

public class DataBaseProp {
private String username;
private String password;
private String url;
private String driverclass;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getDriverclass() {
	return driverclass;
}
public void setDriverclass(String driverclass) {
	this.driverclass = driverclass;
}
public void display()
{
	System.out.println("username:"+username);
	System.out.println("password:"+password);
	System.out.println("url:"+url);
	System.out.println("driverclass:"+driverclass);
}

	
}

