package com.aikyam.avsar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/view_jobs")
public class JobDao {

	public List<Jobs> getAllJobs()
	{
		List<Jobs> list=new ArrayList<Jobs>();
		Jobs j=null;
		
		 RequestDispatcher dispatcher = null;
		 Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aikyam?useSSL=false","root","1234");
		    PreparedStatement pst = con.prepareStatement("select * from jobs order by id desc");
	        
		    ResultSet rs=pst.executeQuery();
		    while(rs.next())
		    {
		    	j=new Jobs();
		    	j.setjob_profile(rs.getString(2));
		    	j.setlocation(rs.getString(3));
		    	j.setcategory(rs.getString(4));
		    	j.setstatus(rs.getString(5));
		    	j.setdescription(rs.getString(6));
		
		    	list.add(j);
		    }
		    
		    
		    
		    
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		
		
		return list;
	}
		
		
	}
	 
	 	
