package com.masai;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/cube")
public class CubeServlet extends HttpServlet {
	
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//works when passed with httpservletrequest
		//int cube = (int)request.getAttribute("num");
		
		//works when passed in uri like parameter
		//int cube = Integer.parseInt(request.getParameter("num"));
		
		// for httpSession
//		HttpSession htSession  = request.getSession();
//		int cube = (int) htSession.getAttribute("num");
		
		// for Cookie
		Cookie[] cookies = request.getCookies();
		int cube=0;
		for(Cookie c:cookies) {
			if(c.getName().equals("num"))
			cube = Integer.parseInt(c.getValue());
		}
		
		cube=cube*cube*cube;
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><body bgcolor='cyan'>");
		
		
		out.println("The cube of the sum of these numbers is "+cube);
		
		out.print("</body></html>");
	}

	

}
