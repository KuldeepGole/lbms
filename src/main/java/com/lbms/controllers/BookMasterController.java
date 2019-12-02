package com.lbms.controllers;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lbms.models.BookMaster;
import com.lbms.services.BookService;

@Controller
public class BookMasterController {

	@Autowired
	private BookService bookService;

	@RequestMapping(value = "/showBookPage", method = RequestMethod.GET)
	public ModelAndView showBookPage(HttpServletRequest request, @ModelAttribute("bookMaster1") BookMaster bookMaster,
			ModelMap model) {
		model.addAttribute("currentDateFromModelMap", new Date());
		return new ModelAndView("librarian/book", model);
	}

	@RequestMapping(value = "**/saveOrUpdateBooks", method = RequestMethod.POST)
	public ModelAndView saveOrUpdateBook(HttpServletRequest request,
			@ModelAttribute("bookMaster1") BookMaster bookMaster, BindingResult result, ModelMap model) {
		bookService.saveBook(bookMaster);
		model.addAttribute("message", "Data Saved in Model");
		return new ModelAndView("librarian/book", model);
	}

	@RequestMapping(value = "/showViewBookPage", method = RequestMethod.GET)
	public ModelAndView showViewBookPage(ModelMap modelMap) {
		modelMap.addAttribute("listBooks", this.bookService.listBooks());
		return new ModelAndView("librarian/viewbook", modelMap);
	}
}
