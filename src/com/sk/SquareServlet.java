package com.sk;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 * Servlet implementation class SquareServlet
 */
@WebServlet("/SquareServlet")
public class SquareServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SquareServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession hs = request.getSession();
		
		int k = 0;
		
		
		
		
		Cookie[] cookies = request.getCookies();
		
		for(Cookie cookie : cookies)
		{
			if(cookie.getName().equals("res")) {
				k = Integer.parseInt(cookie.getValue());	
			}
			 
		}
		k = k * k;
		PrintWriter out = response.getWriter();
		out.println("Square: " + k);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int k = (int) request.getAttribute("res");
		
		k = k * k;
		
		PrintWriter out = response.getWriter();
		out.println("Square: " + k);
	}

}
