package calculator;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Calculator {
	
	@RequestMapping("add")
	public void add(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		int num3=num1+num2;
		res.getWriter().print("<h1>The Sum of "+num1+" and " +num2+" is "+num3 +"</h1>");
	}

	@RequestMapping("sub")
	public void sub(@RequestParam int num1,@RequestParam int num2,HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int num3= num1-num2;
		res.getWriter().print("<h1>The sub of "+num1+" and " +num2+" is "+num3 +"</h1>");
	}
	
	@RequestMapping("mul")
	@ResponseBody
	public String mul(@RequestParam int num1,@RequestParam int num2,HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int num3= num1*num2;
		return "<h1>The Product of "+num1+" and " +num2+" is "+num3 +"</h3>";
	}
	
	@RequestMapping("div")
	public ModelAndView div(@RequestParam double num1,@RequestParam double num2,HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		double num3= num1/num2;
		ModelAndView andView = new ModelAndView("Result.jsp");
		andView.addObject("num1",num1);
		andView.addObject("num2",num2);
		andView.addObject("operation","Division");
		 andView.addObject("num3",num3);
		 return andView; 
	}
}
