package com.sergiofah.controller;

import com.sergiofah.model.Product;
import com.sergiofah.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.xml.ws.http.HTTPException;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/category/{category}")
    public Iterable<Product> getProductFromCategory(@PathVariable String category) {
        return this.productRepository.getProductListFromCategory(category);
    }

    @GetMapping("/model/{model}")
    public Optional<Product> getProductFromModel(@PathVariable String model) {
        return this.productRepository.getProductFromModel(model);
    }
}
