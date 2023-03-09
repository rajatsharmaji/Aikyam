package com.aikyam.registration;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
		String uname = request.getParameter("username");
		String uemail = request.getParameter("uemail");
		String upwd = request.getParameter("password");
		String rpwd = request.getParameter("rpassword");
		String umobile = request.getParameter("umobile");
		
		RequestDispatcher dispatcher = null;
		 Connection con = null;
		 if(uname == null || uname.equals("")){
				request.setAttribute("status","invalidname");
				 dispatcher = request.getRequestDispatcher("signup.jsp");
				 dispatcher.forward(request, response);
			}
		 if(uemail == null || uemail.equals("")){
				request.setAttribute("status","invalidemail");
				 dispatcher = request.getRequestDispatcher("signup.jsp");
				 dispatcher.forward(request, response);
			}
		 if(upwd == null || upwd.equals("")){
				request.setAttribute("status","invalidpwd");
				 dispatcher = request.getRequestDispatcher("signup.jsp");
				 dispatcher.forward(request, response);
			}else if(!upwd.equals(rpwd)) {
				request.setAttribute("status","invalidrpwd");
				 dispatcher = request.getRequestDispatcher("signup.jsp");
				 dispatcher.forward(request, response);
			}
		 
		 if(umobile == null || umobile.equals("")){
				request.setAttribute("status","invalidmobile");
				 dispatcher = request.getRequestDispatcher("signup.jsp");
				 dispatcher.forward(request, response);
			}else if(umobile.length()>10) {
				request.setAttribute("status","invalidmobilelength");
				 dispatcher = request.getRequestDispatcher("signup.jsp");
				 dispatcher.forward(request, response);
			}
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aikyam?useSSL=false","root","1234");
		    PreparedStatement pst = con.prepareStatement("insert into user(username,upwd,uemail,umobile) values(?,?,?,?)");
		    pst.setString(1, uname);
		    pst.setString(2, upwd);
		    pst.setString(3, uemail);
		    pst.setString(4, umobile);
		    
		    int rowCount = pst.executeUpdate();
		    dispatcher = request.getRequestDispatcher("signup.jsp");
		    if(rowCount>0) {
		    	request.setAttribute("status", "success");
		    }else {
		    	request.setAttribute("status", "failed");
		    }
		    dispatcher.forward(request, response);
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
		
	}

}
