package com.ims.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ims.domain.User;
import com.ims.service.UserService;

@Controller
public class IMSCtrl
{
	@Autowired
	private UserService userServiceImpl;
	
	@RequestMapping(value="/index", method={RequestMethod.GET})
	public ModelAndView viewHome()
	{
		System.out.println("In viewIndex()");
		return new ModelAndView("index", "user", new User());
	}
	
	@RequestMapping(value="/login", method={RequestMethod.POST})
	public ModelAndView viewLogin(@ModelAttribute User user)
	{
		System.out.println("In viewLogin()");
		
		if (userServiceImpl.authenticateUser(user) != null)
			return new ModelAndView("home", "user", user);
		else
		{
			ModelAndView mv = new ModelAndView("index");
			mv.addObject("message", "invalid_credentials");
			return mv;
		}
	}
	
	@RequestMapping(value="/register", method={RequestMethod.POST})
	public ModelAndView registerUser(@ModelAttribute User user)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		
		if (userServiceImpl.registerUser(user))
			mv.addObject("message", "successful_registration");
		else
			mv.addObject("message", "user_exists");

		return mv;
	}
	
	@RequestMapping(value="/test", method={RequestMethod.GET})
	public String viewTest()
	{
		System.out.println("In viewTest()");
		return "test";
	}
}
