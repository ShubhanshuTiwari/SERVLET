import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutServlet extends HttpServlet {
	


	
public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		
		PrintWriter out=res.getWriter();
		
		req.getRequestDispatcher("Index.html").include(req, res);
		Cookie ck=new Cookie("name", "");
		ck.setMaxAge(0);
		res.addCookie(ck);
		out.println("You Sucessfully logout");
}
	
	
	
}
