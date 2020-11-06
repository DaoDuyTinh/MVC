package com.daoduytinh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.daoduytinh.model.Banner;
import com.daoduytinh.model.Category;
import com.daoduytinh.model.Products;
import com.daoduytinh.service.BannerService;
import com.daoduytinh.service.CategoryService;
import com.daoduytinh.service.ProductsService;
@Controller
public class ProductsController {

			private ProductsService productsService;
			
			@Autowired(required = true)
			@Qualifier(value = "productsService")
			public void setProductsService(ProductsService pr) {
				this.productsService = pr;
			}
			@RequestMapping(value = "product/{id}", method = RequestMethod.GET)
			public String ProductsDetail(@PathVariable("id") int id, Model model) {
				model.addAttribute("products", new Products());
				model.addAttribute("product", this.productsService.getProductsById(id));
				model.addAttribute("dealsOfWeek", this.productsService.listProductshotdeals());
				model.addAttribute("featuresOfWeek", this.productsService.listProductsfeatureofweek());
				model.addAttribute("newarrivals", this.productsService.listProductsnewarrivals());
				model.addAttribute("newarrivalscover", this.productsService.listProductsnewarrivalscover());
				model.addAttribute("bestseller", this.productsService.listProductsbestseller());
				model.addAttribute("trend", this.productsService.listProductstrend());
				model.addAttribute("review", this.productsService.listProductsreview());
				model.addAttribute("viewed", this.productsService.listProductsviewed());
				model.addAttribute("near", this.productsService.listProductsNearId(id));
				return "product/product";
			}
			
	}
