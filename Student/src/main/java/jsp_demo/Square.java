package jsp_demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/square")
public class Square extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int x=(Integer)req.getAttribute("x");
		int square=x*x;
		resp.getWriter().print("<h1>The square of sum of numbers is "+square+"</h1>");
		
		
	}
}
