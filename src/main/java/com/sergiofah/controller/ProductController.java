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
    String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas accumsan, quam accumsan aliquam dignissim, libero sapien varius eros, at luctus dolor massa quis justo.";

    public ProductController(){
        productList.add(new Product(Line.CRONOS, Category.OLD, "6001-A", loremIpsum, "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/CRONOS-6001-A-2.png"));
        productList.add(new Product(Line.CRONOS, Category.OLD, "6003", loremIpsum, "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/CRONOS-6001-A-2.png"));
        productList.add(new Product(Line.CRONOS, Category.OLD, "7023", loremIpsum, "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/CRONOS-6001-A-2.png"));
        productList.add(new Product(Line.CRONOS, Category.L, "6021L", loremIpsum, "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/CRONOS-6001-A-2.png"));
        productList.add(new Product(Line.CRONOS, Category.L, "6031L", loremIpsum, "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/CRONOS-6001-A-2.png"));
        productList.add(new Product(Line.CRONOS, Category.L, "7023L", loremIpsum, "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/CRONOS-6001-A-2.png"));
        productList.add(new Product(Line.CRONOS, Category.NG, "6003-NG", loremIpsum, "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/CRONOS-6001-A-2.png"));
        productList.add(new Product(Line.CRONOS, Category.NG, "6021-NG", loremIpsum, "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/CRONOS-6001-A-2.png"));
        productList.add(new Product(Line.CRONOS, Category.NG, "6031-NG", loremIpsum, "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/CRONOS-6001-A-2.png"));
        productList.add(new Product(Line.CRONOS, Category.NG, "7021-NG", loremIpsum, "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/CRONOS-6001-A-2.png"));
        productList.add(new Product(Line.CRONOS, Category.NG, "7023-NG", loremIpsum, "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/CRONOS-6001-A-2.png"));
        productList.add(new Product(Line.CRONOS, Category.NG, "6001-NG", loremIpsum, "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/CRONOS-6001-A-2.png"));

        productList.add(new Product(Line.ARES, Category.TB, "7021", loremIpsum,"https://www.eletraenergy.com.br/wp-content/uploads/2022/09/CRONOS-6001-A-2.png" ));
        productList.add(new Product(Line.ARES, Category.TB, "7031", loremIpsum,"https://www.eletraenergy.com.br/wp-content/uploads/2022/09/CRONOS-6001-A-2.png" ));
        productList.add(new Product(Line.ARES, Category.TB, "7023", loremIpsum,"https://www.eletraenergy.com.br/wp-content/uploads/2022/09/CRONOS-6001-A-2.png" ));
        productList.add(new Product(Line.ARES, Category.THS, "8023 15", loremIpsum,"https://www.eletraenergy.com.br/wp-content/uploads/2022/09/CRONOS-6001-A-2.png" ));
        productList.add(new Product(Line.ARES, Category.THS, "8023 200", loremIpsum,"https://www.eletraenergy.com.br/wp-content/uploads/2022/09/CRONOS-6001-A-2.png" ));
        productList.add(new Product(Line.ARES, Category.THS, "8023 2,5", loremIpsum,"https://www.eletraenergy.com.br/wp-content/uploads/2022/09/CRONOS-6001-A-2.png" ));

    }

    public List<String> getLines(){
        Stream<String> listString = Arrays.stream(Line.values()).
                map(Line::getLine);
        return listString.collect(Collectors.toList());
    }

    public List<String> getCategories(){
        Stream<String> categoriesString = Arrays.stream(Category.values()).
                map(Category::getCategory);
        return categoriesString.collect(Collectors.toList());
    }
    public List<String> getProductsFromCategory(String category){
        return productList.stream()
                .filter(p -> p.getCategory().equals(category)).
                map(Product::getModel).
                collect(Collectors.toList());
    }
    public Optional<Product> getProduct(String productName){
        return productList.stream()
                .filter(p -> p.getModel().equals(productName))
                .findFirst();
    }
}
