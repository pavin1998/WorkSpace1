package com.wipro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.wipro.dao.StudentDao;
import com.wipro.model.SpringConfig;
import com.wipro.model.StaffBean;

//@SpringApplicationConfiguration(SpringConfig.class)

@Controller
@Configuration
public class StudentController {
	
	@Autowired
	StudentDao studentdao;
	
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String Index()
	{
		//System.out.println("hello");
		return "index";
	}
	@RequestMapping(value="/hello",method=RequestMethod.POST)
	public String Hello(Model model,@ModelAttribute() StaffBean bean)
	{
		
		if(bean.getStaff_id() != null && bean.getPasswd() != null)
		{
			//return "hello";
			if(studentdao.doLogin(bean.getStaff_id(), bean.getPasswd()) != null)
			{
				model.addAttribute("msg", "welcome");
				return "hello";
			}
			else
			{
				model.addAttribute("msg", "Invalid User Login");
				return "index";
			}
		}
		
		else
		{
			model.addAttribute("msg", "Please enter your details");
			return "index";
		}

}
	@RequestMapping(value="/newuser")
	public String NewUser()
	{
		return "newuser";
	}
	@RequestMapping(value="/trial")
	public String Register(Model model,@ModelAttribute StaffBean bean)
	{
		if(bean.getStaff_id() != null && bean.getTutorname() != null && bean.getUsername() != null && 
				bean.getDept_year() != 0 && bean.getCourse() != null && bean.getDepartment() != null && bean.getPasswd() != null
				&& bean.getClasssection() != null)
		{
			return (studentdao.doRegister(bean));
		}
		else {
			model.addAttribute("msg", "Plese Enter Details");
		return "newuser";
	}
	
	}
	@RequestMapping(value = "/details")
	public String Detaisl()
	{
		return "studentdetails";
	}
	
}
