package com.daoduytinh.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.daoduytinh.service.BannerService;

@Controller
public class HomeController {
	@Autowired
	  private BannerService bannerservice;
	  @RequestMapping(value={"/", "/home"})
	  public String listBanner(Model model) {
	    model.addAttribute("bannertop", bannerservice.Banner());
	    return "home/home";  
	  }
}