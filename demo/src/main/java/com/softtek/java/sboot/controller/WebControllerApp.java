package com.softtek.java.sboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.softtek.java.sboot.entity.Product;
import com.softtek.java.sboot.service.ProductService;

@Controller
public class WebControllerApp {
	
	@Autowired
    ProductService productService;
	
	@Value("${softtek.app.title}")
	private String appTitle;
	
	@GetMapping("/home")
	public String goHome(Model model) {
		model.addAttribute("jaTitle", appTitle);
		return "index";
	}
	
	@GetMapping("/about")
	public String goAbout(Model model) {
		model.addAttribute("jaTitle", appTitle);
		return "about";
	}
	
	@GetMapping("/services")
	public String goServices(Model model) {
		model.addAttribute("jaTitle", appTitle);
		return "services";
	}
	
	@GetMapping("/products")
	public String goProducts(Model model) {
		List<Product> products = productService.getAllProduct();
		model.addAttribute("products", products);
		return "products";
	}
	
	@GetMapping("/blog-home")
	public String goBlogHome(Model model) {
		model.addAttribute("jaTitle", appTitle);
		return "blog-home";
	}
	
	@GetMapping("/blog-single")
	public String goBlogSingle(Model model) {
		model.addAttribute("jaTitle", appTitle);
		return "blog-single";
	}
	
	@GetMapping("/contact")
	public String goContact(Model model) {
		model.addAttribute("jaTitle", appTitle);
		return "contact";
	}
	
	@GetMapping("/elements")
	public String goElements(Model model) {
		model.addAttribute("jaTitle", appTitle);
		return "elements";
	}
	
	@GetMapping("/product-details")
	public String goProductDetails(Model model) {
		model.addAttribute("jaTitle", appTitle);
		return "product-details";
	}
}
