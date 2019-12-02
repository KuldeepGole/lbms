package com.lbms.controllers;

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
import com.lbms.models.IssueBookMaster;
import com.lbms.services.IssueBookService;

@Controller
public class IssueBookMasterController {
	@Autowired
	private IssueBookService issueBookService;
	
	@RequestMapping(value = "/showIssueBookPage", method = RequestMethod.GET)
	public ModelAndView showIssueBookPage(HttpServletRequest request, @ModelAttribute("issueBookMaster") IssueBookMaster issueBookMaster,
			ModelMap model) {
		return new ModelAndView("librarian/issuebook", model);
	}
	
	@RequestMapping(value = "**/saveOrUpdateIssueBooks", method = RequestMethod.POST)
	public ModelAndView saveOrUpdateIssueBooks(HttpServletRequest request,
			@ModelAttribute("issueBookMaster") IssueBookMaster issueBookMaster, BindingResult result, ModelMap model) {
		issueBookService.saveIssueBook(issueBookMaster);
		model.addAttribute("message", "Data Saved in Model");
		return new ModelAndView("librarian/issuebook", model);
	}
}
