package edu.zut.cs.software.admin.entity;

import java.util.Date;

public class User {
	Long id;
	String name;
	String password;
	boolean gender;
	Date birthday;
	public Long getId()
	{
		return id;
	}
	public void setId(Long id)
	{
		this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String Password)
	{
		this.password=Password;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
		

	
}
