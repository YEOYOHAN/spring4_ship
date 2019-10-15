package com.ship.web.controllers;

import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.ship.web.serviceimpls.UserServiceImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired UserServiceImpl userService;

	@GetMapping("/")
	public String home(Locale locale, Model model) {
		logger.info("Welcome {}.", "HomeController");
		int count = userService.countUser();
		model.addAttribute("count", count );
		return "home";
	}
	
}