package com.lbms.controllers;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LibrarianController {
	@RequestMapping(value = "/librarian", method = RequestMethod.GET)
	public String login() {
		return "librarian";
	}

	@RequestMapping(value = "/librarian2", method = RequestMethod.GET)
	public ModelAndView login2() {
		return new ModelAndView("librarian");
	}

	@RequestMapping(value = "/librarian3", method = RequestMethod.GET)
	public ModelAndView login3(HttpServletRequest request, ModelMap model) {
		model.addAttribute("currentDateFromModelMap", new Date());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		request.getSession(false).setAttribute("currentDateFromSession", new Date());
		return new ModelAndView("librarian",model);
	}
	
	
}
