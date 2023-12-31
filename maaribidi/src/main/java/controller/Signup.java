package controller;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CustomerDao;
import dto.Customer;

@WebServlet("/signup")
public class Signup extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String mobile= req.getParameter("mob");
		String password=req.getParameter("password");
		String gender=req.getParameter("gender");
		String dob=req.getParameter("dob");
		String address=req.getParameter("address");
		
		Date date=Date.valueOf(dob);
		

		CustomerDao dao = new CustomerDao();
		
		int age=Period.between(date.toLocalDate(), LocalDate.now()).getYears();
		
		if(age<18)
		{
			resp.getWriter().print("<h1> Cannot create account,the age should be greater than 18 to create account</h1>");
			req.getRequestDispatcher("Signup.html").include(req, resp);
		}
		else
		{
			
			if(dao.find(Long.parseLong(mobile)).isEmpty() && dao.find(email).isEmpty())
			{
		Customer customer = new Customer();
		customer.setName(name);
		customer.setEmail(email);
		customer.setMobile(Long.parseLong(mobile));
		customer.setPassword(password);
		customer.setGender(gender);
		customer.setDob(date);
		customer.setAddress(address);
		customer.setAge(age);
		
		
		dao.save(customer);
		
		
		
		resp.getWriter().print("<h1 styke='color:red'> Accounted created successfully</h1>");
		resp.getWriter().print("<h1 styke='color:green'> Your Customer ID is :"+customer.getCustid()+"</h1>");
		req.getRequestDispatcher("Home.jsp").include(req, resp);
			}
			else
			{
				resp.getWriter().print("<h1 styke='color:red'> Cannot create account,mobile number or email alredy exists</h1>");
				req.getRequestDispatcher("Signup.html").include(req, resp);	
			}
		
		}
	}

}
