package com.sergiofah.model;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "product")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIncludeProperties(value = {"id"})
    @ManyToOne
    @JoinColumn(name = "line_id")
    private Line line;

    @JsonIncludeProperties(value = {"id"})
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name = "model", unique = true)
    private String model;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "image_url")
    private String imageUrl;

    public Product() {
    }

    public Product(Line line, Category category, String model, String description, String imageUrl) {
        this.line = line;
        this.category = category;
        this.model = model;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public Line getLine() {
        return line;
    }

    public Long getId() {
        return id;
    }

    public void setLine(Line line) {
        this.line = line;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
