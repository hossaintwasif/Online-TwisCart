package com.online.TwisCart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.online.ShoppingBackend.dao.CategoryDAO;
import com.online.ShoppingBackend.dto.Category;

@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDAO;

	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView index() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Home");
		
		//Passing the List of categories
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("userClickHome",true);
		return mv;
	}
	
	@RequestMapping(value= {"/about"})
	public ModelAndView about() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","About Us");
		mv.addObject("userClickAbout",true);
		return mv;
	}
	
	@RequestMapping(value= {"/contact"})
	public ModelAndView contact() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Contact us");
		mv.addObject("userClickContact",true);
		return mv;
	}
	

	//Methods to load all the products based on category
	@RequestMapping(value= "/show/all/products")
	public ModelAndView showALLProducts() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","All Products");
		
		//Passing the List of categories
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("userClickAllProducts",true);
		return mv;
	}
	
	@RequestMapping(value= "/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id")int id) {
		ModelAndView mv=new ModelAndView("page");
		
		// Category dao to fetch a single category
		Category category=null;
		category=categoryDAO.get(id);
		
		mv.addObject("title",category.getName());
		
		//Passing the List of categories
		mv.addObject("categories",categoryDAO.list());
		
		//Passing the single category object
		mv.addObject("category",category);
		
		mv.addObject("userClickCategoryProducts",true);
		return mv;
	}
}