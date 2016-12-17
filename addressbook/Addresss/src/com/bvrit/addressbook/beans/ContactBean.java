package com.bvrit.addressbook.beans;

public class ContactBean {
     String id;
     String name;
     String email;
     String phno;
     String user;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public ContactBean(String id, String name, String email, String phno,
			String user) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phno = phno;
		this.user = user;
	}
	public ContactBean() {
		super();
		// TODO Auto-generated constructor stub
	}
     
}
