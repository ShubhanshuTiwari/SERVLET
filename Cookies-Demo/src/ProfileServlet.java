import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProfileServlet extends HttpServlet {

	
public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		
		PrintWriter out=res.getWriter();
		
		req.getRequestDispatcher("Index.html").include(req, res);
		
			Cookie ck[]=req.getCookies();
			if(ck!=null) {
				String name=ck[0].getValue();
				if(!name.equals("")||name!=null) {
					out.println("Welcome To Profile"+name);
				}
			}
			else {
				out.print("First you have to login");
				req.getRequestDispatcher("Index.html");
			}
			
		
		
		
		
		
	}
	
}
