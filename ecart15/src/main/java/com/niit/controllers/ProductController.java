package com.niit.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import domain.Product;



@Controller
public class ProductController {
public ProductController() //Constructor
{
	System.out.println("CREATED PRODUCTCONTROLLER");
}
@RequestMapping("/")
public String gethomePage() //
{
	
	return "home";
}

@RequestMapping("/ProductForm")
public String getProductForm(Model model) //
{
	System.out.println("product form page");
	
	model.addAttribute("product",new Product());
	System.out.println("product form page1");
	return "ProductForm";
}

public ModelAndView displayProductDetails(@ModelAttribute("product") Product product)
{
	return new ModelAndView("displayProduct","productObj",product);
}
}