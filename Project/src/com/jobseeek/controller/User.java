package com.jobseeek.controller;

public class User {
	int id;
    String name;
    String email;
    String password;
    boolean isNotRecruiter;

    public User() {
    }

    public User(int id, String name, String email, String password, boolean isNotRecruiter) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.isNotRecruiter = isNotRecruiter;
    }

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public User(String email, String password) {
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

	public boolean isNotRecruiter() {
		return isNotRecruiter;
	}

	public void setNotRecruiter(boolean isNotRecruiter) {
		this.isNotRecruiter = isNotRecruiter;
	}
    
    
    
}



