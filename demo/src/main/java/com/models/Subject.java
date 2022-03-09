package com.models;

public class Subject 
{
	private Long id;
	private String name;
	
	public Subject(String name)
	{
		setName(name);
	}
	
	public Subject()
	{
		this("");
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id) 
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
}
