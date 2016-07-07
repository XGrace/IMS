package com.ims.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="IMS_USERS")
public class User
{
	@Id
	@Column(name="IMS_USERS_ID")
	@SequenceGenerator(name="userSeq", sequenceName="IMS_USERS_SEQ", allocationSize=1)
	@GeneratedValue(generator="userSeq", strategy=GenerationType.SEQUENCE)
	private Long userId;
	
	@Column(name="IMS_USERNAME")
	private String username;
	
	@Column(name="IMS_PASSWORD")
	private String password;
	
	@Column(name="USER_FIRST_NAME")
	private String firstName;
	
	@Column(name="USER_LAST_NAME")
	private String lastName;
	
	@Column(name="USER_EMAIL")
	private String email;
	
	@Transient
	private Boolean authenticated;
	
	@Override
	public String toString()
	{
		return "User [UserId=" + userId + ", username=" + username + ", password=" + password + ", firstName="
				+ firstName + ", lastName=" + lastName + ", email=" + email + ", authenticated=" + authenticated + "]";
	}

	public User() 
	{
	}

	public User(Long userId, String username, String password, String firstName, String lastName, String email,
			Boolean authenticated)
	{
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.authenticated = authenticated;
	}

	public Long getUserId()
	{
		return userId;
	}

	public void setUserId(Long userId)
	{
		this.userId = userId;
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
