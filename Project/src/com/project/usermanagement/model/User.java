package com.project.usermanagement.model;

public class User {
protected int id;
protected String name;
protected String email;
protected String country;
protected String experience;

protected String formLink;
protected String skills;
protected String jobdescription;
protected String joblocation;
public User() {
	
}

public User(String name, String email, String country, String experience,String formLink,String skills,String jobdescription,String joblocation) {
	super();
	this.name = name;
	this.email = email;
	this.country = country;
	this.experience=experience;
	this.formLink=formLink;
	this.skills=skills;
	this.jobdescription=jobdescription;
	this.joblocation=joblocation;
}

public User(int id, String name, String email, String country, String experience, String formLink, String skills,String jobdescription,String joblocation) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.country = country;
	this.experience=experience;
	this.formLink = formLink;
	this.skills=skills;
	this.jobdescription=jobdescription;
	this.joblocation=joblocation;
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

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public String getExperience() {
	return experience;
}

public void setExperience(String experience) {
	this.experience = experience;
}

public String getFormLink() {
	return formLink;
}

public void setFormLink(String formLink) {
	this.formLink = formLink;
}

public String getSkills() {
	return skills;
}

public void setSkills(String skills) {
	this.skills = skills;
}

public String getJobdescription() {
	return jobdescription;
}

public void setJobdescription(String jobdescription) {
	this.jobdescription = jobdescription;
}

public String getJoblocation() {
	return joblocation;
}

public void setJoblocation(String joblocation) {
	this.joblocation = joblocation;
}


}
