import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
	
	

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		
		PrintWriter out=res.getWriter();
		
		req.getRequestDispatcher("Index.html").include(req, res);
		String name=req.getParameter("uname");
		String pass=req.getParameter("pass");
		if(pass.equals("1234")) {
			out.println("u are successfuly logged in");
			out.println("Welcome "+name);
			Cookie ck=new Cookie("name", name);
			res.addCookie(ck);
		}
		else {
			out.println("You entered wrong credentials");
		}
		
		
		
	}
	
	
}
