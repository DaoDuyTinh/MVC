package com.daoduytinh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ckeditor {
	@RequestMapping(value = "home")
	public String AdminProducts(Model model) {
		
		return "helloworld";
	}

}
