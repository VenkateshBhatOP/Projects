package com.project.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jobseeek.controller.Recruiter;
import com.jobseeek.controller.User;

/**
 * Servlet implementation class RecruiterLoginController
 */
@WebServlet("/RecruiterLoginController")
public class RecruiterLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RecruiterLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String dbemail=null;
		String dbpassword=null;
		String dbusername=null;
		
	   String email=request.getParameter("email");
	   String password=request.getParameter("password");
	   String username=request.getParameter("name");
	   
	   String sql="select * from recruiter_table where ENAME=? and EMAIL=? and PASSWORD=?";
	   try {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		Connection con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-K459BPE;databaseName=PGJQP_S210218;user=sa;password=niit@123");
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1,username);
		ps.setString(2,email);
		ps.setString(3, password);
		
		ResultSet rs=ps.executeQuery();
	
		while(rs.next()) {
			dbusername=rs.getString(1);
			dbemail=rs.getString(3);
			dbpassword=rs.getString(4);
		}
	
		
		
		if(username.equals(dbusername) && email.equals(dbemail) && password.equals(dbpassword)) {
			RequestDispatcher rm=request.getRequestDispatcher("recruiternavbar.jsp");
			rm.include(request, response);
			
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("recruiterlogin.jsp");
			rd.include(request, response);
		}
		
		
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   return;
	   
	   
	}
	
}
