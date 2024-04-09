package com.sergiofah.controller;

import com.sergiofah.model.Category;
import com.sergiofah.model.Line;
import com.sergiofah.model.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductController {
    List<Product> productList = new ArrayList<>();

    public ProductController(){
        productList.add(new Product(Line.CRONOS, Category.NG, "6001-NG", "<Nada>", "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/CRONOS-6001-A-2.png"));
        System.out.println(productList.get(0).getModel());
    }

    public List<String> getLines(){
        Stream<String> listString = Arrays.stream(Line.values()).map(Line::getLine);
        return listString.collect(Collectors.toList());
    }

    public List<String> getCategories(){
        Stream<String> categoriesString = Arrays.stream(Category.values()).map(Category::getCategory);
        return categoriesString.collect(Collectors.toList());
    }

    public Optional<Product> getProduct(String productName){
        return productList.stream()
                .filter(p -> p.getModel().equals(productName))
                .findFirst();
    }
}
