package com.psl;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController 
{
	@RequestMapping("/emp")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response)
	{
		String id=request.getParameter("id");
		String firstName=request.getParameter("firstName");
		String lastName =request.getParameter("lastName");
		String sal=request.getParameter("sal");
		String email=request.getParameter("email");
		
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Display.jsp");
		Employee emp=new Employee(id,firstName,lastName,sal,email);
		mv.addObject("emp",emp);
		return mv;
		
	}

}