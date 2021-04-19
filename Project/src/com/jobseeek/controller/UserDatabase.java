package com.jobseeek.controller;


import java.sql.*;

public class UserDatabase {
	Connection con;

	public UserDatabase(Connection con) {
		this.con = con;
	}

	
	public boolean saveUser(User user) {
		boolean set = false;
		try {
			
			String query = "insert into [dbo].[user](Name,Email,Password) values(?,?,?)";

			PreparedStatement pt = this.con.prepareStatement(query);
			pt.setString(1, user.getName());
			pt.setString(2, user.getEmail());
			pt.setString(3, user.getPassword());

			pt.executeUpdate();
			set = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return set;
	}
	
	//Login method Just for "Normal" User - Not Recruiter
	public User logUser(String email,String password) {
		User user=null;
		try {
        String query="select*from [dbo].[user] where Email=? and Password=? ";
        PreparedStatement pst=this.con.prepareStatement(query);
        pst.setString(1, email);
        pst.setString(2, password);
        ResultSet rs=pst.executeQuery();
        if(rs.next()) {
        	user=new User();
        	user.setName(rs.getString("name"));
        	user.setEmail(rs.getString("email"));
        	user.setPassword(rs.getString("password"));
        	user.setNotRecruiter(true);
        }
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return user;
			
		
	}
}

