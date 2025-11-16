package com.ecommerce.controller.rest;

import com.ecommerce.entity.Category;
import com.ecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AdminRestController {
	
	@Autowired
	CategoryService categoryService;
	
	@PostMapping("/save-category")
	public String saveCategory(@ModelAttribute Category category) {
		categoryService.saveCategory(category);
		return "redirect:/category";
	}

}
