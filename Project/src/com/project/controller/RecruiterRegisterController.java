package com.project.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jobseeek.controller.Recruiter;

/**
 * Servlet implementation class RecruiterRegisterController
 */
@WebServlet("/RecruiterRegisterController")
public class RecruiterRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RecruiterRegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		String cname=request.getParameter("company");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		String sql="insert into recruiter_table values(?,?,?,?)";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection con =DriverManager.getConnection("jdbc:sqlserver://DESKTOP-K459BPE;databaseName=PGJQP_S210218;user=sa;password=niit@123");
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, cname);
			ps.setString(3, email);
			ps.setString(4, password);
			
			
			
		if(ps.executeUpdate()>0) {
			response.sendRedirect("recruiterlogin.jsp");
		}
		else {
			response.sendRedirect("error.jsp");
		}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
			
		
		
		
	}

}
