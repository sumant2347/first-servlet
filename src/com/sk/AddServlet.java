package com.sk;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class AddServlet extends HttpServlet {
	
//    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
//    	
//    	int i = Integer.parseInt(request.getParameter("num1"));
//    	int j = Integer.parseInt(request.getParameter("num2"));
//    	
//    	PrintWriter out = response.getWriter();
//    	out.println(i+j);
//    	
//    	 
//    }
    
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int i = Integer.parseInt(request.getParameter("num1"));
    	int j = Integer.parseInt(request.getParameter("num2"));
    	
    	PrintWriter out = response.getWriter();
    	out.println(i+j);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int i = Integer.parseInt(request.getParameter("num1"));
    	int j = Integer.parseInt(request.getParameter("num2"));
    	int k = i+j;
    	
    	Cookie cookie = new Cookie("res", k + ""); // just converting to string by appending ""
    	
    	response.addCookie(cookie);
    	
    	response.sendRedirect("square");

    	
	}

}
