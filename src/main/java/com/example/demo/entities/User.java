package com.example.demo.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;

@Entity
public class User 
{
	@Id
	@GeneratedValue
	private Long id;
	
    private String name;
	
	private String password;
	
	@Email(message="Email should be a valid email")
	private String email;
	
	private Double salary;
	
	private Date dateOfBirth;
	
	public User()
	{
		
	}
	public User(String name, String password, String email, Double salary, Date dob)
    {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.salary = salary;
		this.dateOfBirth=dob;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	

}
