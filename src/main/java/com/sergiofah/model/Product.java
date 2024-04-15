package com.sergiofah.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "product")
public class ProductEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "line_id")
    private LineEntity line;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity category;

    @Column(name = "model", unique = true)
    private String model;

    @Column(name = "description")
    private String description;

    @Column(name = "image_url")
    private String imageUrl;

    public ProductEntity() {
    }

    public ProductEntity(LineEntity line, CategoryEntity category, String model, String description, String imageUrl) {
        this.line = line;
        this.category = category;
        this.model = model;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public LineEntity getLine() {
        return line;
    }

    public void setLine(LineEntity line) {
        this.line = line;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
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
