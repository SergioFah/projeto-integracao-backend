package com.sergiofah.controller;

import com.sergiofah.model.Category;
import com.sergiofah.model.Product;
import com.sergiofah.repository.CategoryRepository;
import com.sergiofah.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private final CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping
    public Iterable<Category> getCategories(){
        return this.categoryRepository.findAll();
    }

    @GetMapping("/{line}")
    public Iterable<Category> getCategoriesFromLine(@PathVariable String line){
        return this.categoryRepository.getCategoriesFromLine(line);
    }
}
