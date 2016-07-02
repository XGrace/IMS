package com.ims.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="")
public class User
{
	@Id
	@Column(name="")
	@SequenceGenerator(name="userSeq", sequenceName="user_seq", allocationSize=1)
	@GeneratedValue(generator="userSeq", strategy=GenerationType.SEQUENCE)
	private Long id;
	
	@Column(name="")
	private String username;
	
	@Column(name="")
	private String password;
	
	@Column(name="")
	private String firstName;
	
	@Column(name="")
	private String lastName;
	
	@Column(name="")
	private String email;
	
	private Boolean authenticated;
	
	@Override
	public String toString()
	{
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + ", authenticated=" + authenticated + "]";
	}

	public User() 
	{
		
	}

	public User(Long id, String username, String password, String firstName, String lastName, String email,
			Boolean authenticated)
	{
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.authenticated = authenticated;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
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

	public Boolean getAuthenticated()
	{
		return authenticated;
	}

	public void setAuthenticated(Boolean authenticated)
	{
		this.authenticated = authenticated;
	}
}
