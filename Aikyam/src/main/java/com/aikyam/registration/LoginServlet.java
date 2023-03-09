package com.aikyam.registration;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String uemail= request.getParameter("uemail");
	String upwd= request.getParameter("password");
	RequestDispatcher dispatcher = null;
	HttpSession session = request.getSession();

	if(uemail == null || uemail.equals("")){
		request.setAttribute("status","invalidemail");
		 dispatcher = request.getRequestDispatcher("login.jsp");
		 dispatcher.forward(request, response);
	}
	if(upwd == null || upwd.equals("")){
		request.setAttribute("status","invalidpwd");
		 dispatcher = request.getRequestDispatcher("login.jsp");
		 dispatcher.forward(request, response);
	}
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aikyam?useSSL=false","root","1234");
	 PreparedStatement pst = con.prepareStatement("select * from user where uemail = ? and upwd = ?");
	 pst.setString(1, uemail);
	 pst.setString(2, upwd);
	 
	 ResultSet rs = pst.executeQuery();
	 
		if(uemail.equals("admin@gmail.com") && upwd.equals("1234")){
			 dispatcher = request.getRequestDispatcher("avsaradminview.jsp");
		}
		
		else if(rs.next()) {
		 session.setAttribute("username", rs.getString("username"));
		 dispatcher = request.getRequestDispatcher("homepage.jsp");
	 } else {
		 request.setAttribute("status", "failed");
		 dispatcher = request.getRequestDispatcher("login.jsp");
	 }
	 dispatcher.forward(request, response);
	 
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	}

}
