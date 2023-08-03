package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;
import dto.UserDTO;

@WebServlet("/update")
public class Update extends HttpServlet 
{
	@Override()
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
			UserDTO dto = new UserDTO();
			dto.setEmail(req.getParameter("email"));
			dto.setName(req.getParameter("name"));
			dto.setPassword(req.getParameter("pwd"));
			dto.setMobile(Long.parseLong( req.getParameter("mob")));
			
//			res.getWriter().print("<h1>"+dto+"</h1>");
			UserDAO userdao= new UserDAO();
			
			userdao.update(dto);
			resp.getWriter().print("<h1> Updated Successfully</h1>");
			req.setAttribute("list", userdao.fetchAll());
			req.getRequestDispatcher("Home.jsp").include(req, resp);
		
	}
}
