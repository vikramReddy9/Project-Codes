package com.vikram;

public class car {
private static car c= new car();
private car()
{
	System.out.println("car constructor");
}

public static car getInstance()
{
	return c;
}
}
