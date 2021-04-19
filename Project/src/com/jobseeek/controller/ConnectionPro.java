package com.jobseeek.controller;
import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionPro {
private static Connection con;
    
    public static Connection getConnection(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-K459BPE;databaseName=PGJQP_S210218;user=sa;password=niit@123");
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}




