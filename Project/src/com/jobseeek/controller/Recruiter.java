package com.jobseeek.controller;

public class Recruiter {
	int id;
String name;
String cname;
String email;
String password;

public Recruiter() {
	
	// TODO Auto-generated constructor stub
}

public Recruiter(int id, String name, String cname, String email, String password) {
	super();
	this.id = id;
	this.name = name;
	this.cname = cname;
	this.email = email;
	this.password = password;
}

public Recruiter(String name, String cname, String email, String password) {
	super();
	this.name = name;
	this.cname = cname;
	this.email = email;
	this.password = password;
}

public Recruiter(String cname, String email, String password) {
	super();
	this.cname = cname;
	this.email = email;
	this.password = password;
}

public Recruiter(String email, String password) {
	super();
	this.email = email;
	this.password = password;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCname() {
	return cname;
}

public void setCname(String cname) {
	this.cname = cname;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}


}
