package com.models;

import com.enums.Roles;

public class User 
{
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String address;
	private String password;
	private Roles role;
	
	public User(String firstName, String lastName, String email, String phone,
			String address, String password, Roles role) 
	{
		super();
		
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setPhone(phone);
		setAddress(address);
		setPassword(password);
		setRole(role);
	}
	
	public User()
	{
		this("", "", "", "", "", "", Roles.DEFAULT);
	}

	public Long getId() 
	{
		return id;
	}

	public void setId(Long id) 
	{
		this.id = id;
	}

	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getPhone() 
	{
		return phone;
	}

	public void setPhone(String phone) 
	{
		this.phone = phone;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}

	public Roles getRole()
	{
		return role;
	}

	public void setRole(Roles role) 
	{
		this.role = role;
	}
	
	
	
}
