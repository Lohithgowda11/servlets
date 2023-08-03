package jsp_demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class Add extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num1 =Integer.parseInt(req.getParameter("num1"));
		int num2 =Integer.parseInt(req.getParameter("num2"));
		int sum = num1+num2;
		resp.getWriter().print("<h1>The sum of numbers is "+sum+"</h1>");
		req.setAttribute("x", sum);
		req.getRequestDispatcher("square").include(req, resp);
	}

}
