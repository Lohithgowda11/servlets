package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import dto.Employee;

@Controller
public class EmployeeController 
{
	@Autowired
	Employee employee;
	
	
	@GetMapping("loademployee")
public ModelAndView loadEmployee()
{
		ModelAndView andView = new ModelAndView("InserData.jsp");
		andView.addObject("employee",employee);
	
		return andView;
}
}
