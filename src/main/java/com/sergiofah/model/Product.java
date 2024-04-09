package com.sergiofah.model;

import java.net.URL;

public class Product {
    private Line line;
    private Category category;
    private String model;
    private String descr;
    private String imgUrl;

    public Product(Line line, Category category, String model, String descr, String imgUrl) {
        this.line = line;
        this.category = category;
        this.model = model;
        this.descr = descr;
        this.imgUrl = imgUrl;
    }

    public String getLine() {
        return line.getLine();
    }

    public String getCategory() {
        return (category.getCategory());
    }

    public String getModel() {
        return (line.getLine() + " " + model);
    }

    public String getDescr() {
        return descr;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
