package com.sergiofah.controller;

import com.sergiofah.dto.CategoryDTO;
import com.sergiofah.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public List<CategoryDTO> getCategories(@RequestParam(name = "line", required = false) Long line) {
        return categoryService.getCategories(line);
    }
}
