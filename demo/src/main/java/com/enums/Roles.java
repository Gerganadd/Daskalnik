package com.enums;

public enum Roles 
{
	DEFAULT(1),
	STUDENT(2),
	TEACHER(4),
	ADMINISTRATOR(8);
	
	private int value;
	
	private Roles(int value)
	{
		this.value = value;
	}
	
	public int getValue() 
	{
		return this.value;
	}
	
}
