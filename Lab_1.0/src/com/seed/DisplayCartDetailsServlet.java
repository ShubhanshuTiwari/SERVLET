package com.seed;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//	TODO:1 Make DisplayCartDetailsServlet as a HttpServlet

public class DisplayCartDetailsServlet extends HttpServlet {

//	TODO:2 	Provide call-back method (called by web container) for HTTP request made using HTTP GET method
//	TODO:3	This method should read products selected by web-client from bookCatelogue.html and 
//					display them in tabular format as html response to the web client.	
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		PrintWriter out=response.getWriter();
		 String checkboxValue=request.getParameter("bookName");  
		 
		 
		 
		 out.println("<HTML>");
			
			out.println("<head><title>");
			out.println("My first web page using servlet!");
			out.println("</title></head>");

			
			out.println("<body>");
			out.println("<table border=\1\">");
			out.println("<h1>");
			out.println("<tr>");
			out.println("<td>");
			out.println("Your selected value");
			out.println("</td>");
			out.println("<td>");
			out.println(checkboxValue);
			out.println("</td>");
			out.println("</tr>");
			
			out.println("</h1>");
			out.println("</body>");
			
			
			out.println("</HTML>");
			
			
		
	}
	
	
	
	
	
}









