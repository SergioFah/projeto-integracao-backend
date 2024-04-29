package com.sergiofah.controller;

import com.sergiofah.model.Product;
import com.sergiofah.repository.ProductRepository;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.xml.ws.http.HTTPException;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Operation(summary = "Get products from a category")
    @GetMapping
    public Iterable<Product> getProductFromCategory(@RequestParam Long category) {
        return this.productRepository.getProductListFromCategory(category);
    }

    @Operation(summary = "Get products from a ID")
    @GetMapping("/{model}")
    public Optional<Product> getProductFromModel(@PathVariable Long model) {
        return this.productRepository.getProductFromModel(model);
    }
}
