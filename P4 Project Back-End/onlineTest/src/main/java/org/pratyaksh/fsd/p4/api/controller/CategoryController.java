package org.pratyaksh.fsd.p4.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.pratyaksh.fsd.p4.api.dto.Category;
import org.pratyaksh.fsd.p4.api.exception.OnlineTestServiceException;
import org.pratyaksh.fsd.p4.api.service.CategoryService;

@RestController
@RequestMapping(value = "/api",
				produces = { MediaType.APPLICATION_JSON_VALUE })
public class CategoryController {

	@Autowired
	private CategoryService service;
	
	@GetMapping("/category")
	public List<Category> getCategories() throws OnlineTestServiceException {
		return service.getCategories();
	}
	
}
