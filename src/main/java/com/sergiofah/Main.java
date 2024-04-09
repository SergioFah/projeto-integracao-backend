package com.sergiofah;

import com.sergiofah.model.Category;
import com.sergiofah.model.Line;
import com.sergiofah.model.Product;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        Product product = new Product(Line.ARES, Category.NG, "6001-NG", "<Nada>", "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/CRONOS-6001-A-2.png");
        System.out.println(product.getLine());
        System.out.println(product.getCategory());
        System.out.println(product.getModel());
    }
}