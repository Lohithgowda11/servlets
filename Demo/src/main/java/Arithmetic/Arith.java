package Arithmetic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sum")
public class Arith extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int n1 = Integer.parseInt(req.getParameter("n1"));
		int n2 = Integer.parseInt(req.getParameter("n2"));
		int sum= n1+n2;
		int dif=n1-n2;
		int mul=n1*n2;
		int div=n1/n2;
		resp.getWriter().print("<h1>The sum if number is "+sum+"</h1>");
		resp.getWriter().print("<h1>The difference if number is "+dif+"</h1>");
		resp.getWriter().print("<h1>The multiply if number is "+mul+"</h1>");
		resp.getWriter().print("<h1>The division if number is "+div+"</h1>");
	}
}
