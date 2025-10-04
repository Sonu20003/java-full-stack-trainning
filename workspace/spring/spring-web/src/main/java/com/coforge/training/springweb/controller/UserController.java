package com.coforge.training.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Author    :Sonu.2
 * Date      :Sep 29, 2025
 * Time      :10:28:29 AM
 * Project   :spring-web
 */

@Controller
public class UserController {
	
	// Model map is a container t  hold the data with key/value representation
	@RequestMapping(value="/user", method = RequestMethod.GET)
	public String userInfo(ModelMap model) {
		model.addAttribute("user", "Rod Johnson");
		model.addAttribute("d", new java.util.Date());
		return "user";
	}
	
	@RequestMapping("/spring")
	public String showSecond() {
		return "Second"; // return views
	}
	
}
