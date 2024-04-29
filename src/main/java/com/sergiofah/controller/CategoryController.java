package com.sergiofah.controller;

import com.sergiofah.model.Category;
import com.sergiofah.model.Product;
import com.sergiofah.repository.CategoryRepository;
import com.sergiofah.repository.ProductRepository;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private final CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Operation(summary = "Get all categories or inform a lineID to filter for categories from lines")
    @GetMapping
    public Iterable<Category> getCategories(@RequestParam(name = "line", required = false) Long line){
        if(line != null)
            return this.categoryRepository.getCategoriesFromLine(line);
        else{
            return this.categoryRepository.findAll();
        }
    }
}
