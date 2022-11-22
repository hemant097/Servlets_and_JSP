package com.masai;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfigDemo extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
	
		PrintWriter out = res.getWriter();
		
		//ServletContext is shared among all of the servlets
		ServletContext sctx = getServletContext(); //req.getServletContext();
		
		out.write("Hello friends, my name is "+sctx.getInitParameter("name")+
				" I am from "+sctx.getInitParameter("country"));
		
		//ServletConfig is only for one specific servlet, check web.xml
		ServletConfig sconfig = getServletConfig();
		
		out.write("\nI live in "+sconfig.getInitParameter("city"));
		
	}
}
