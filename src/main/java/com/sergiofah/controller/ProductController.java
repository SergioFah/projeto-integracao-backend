package com.sergiofah.controller;

import com.sergiofah.dto.ProductDTO;
import com.sergiofah.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<ProductDTO> getProductFromCategory(@RequestParam Long category) {
        return this.productService.getProductFromCategoryId(category);
    }
    @GetMapping("/{model}")
    public ProductDTO getProductFromModel(@PathVariable Long model) {
        return this.productService.getProductById(model);
    }
}
