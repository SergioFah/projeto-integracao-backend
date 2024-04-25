package com.sergiofah.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "category")
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "line_id")
    private Line line;

    @Column(name = "category", unique = true)
    private String category;

    @JsonIgnore
    @OneToMany(mappedBy = "category")
    private List<Product> products;

    public Category() {
    }

    public Category(Line line, String category) {
        this.line = line;
        this.category = category;
    }

    public Line getLine() {
        return line;
    }

    public String getLineString(){
        return line.getLine();
    }

    public void setLine(Line line) {
        this.line = line;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
