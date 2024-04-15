package com.sergiofah.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "category")
public class CategoryEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "line_id")
    private LineEntity line;

    @Column(name = "category", unique = true)
    private String category;

    @OneToMany(mappedBy = "category")
    private List<ProductEntity> products;

    public CategoryEntity() {
    }

    public CategoryEntity(LineEntity line, String category) {
        this.line = line;
        this.category = category;
    }

    public LineEntity getLine() {
        return line;
    }

    public void setLine(LineEntity line) {
        this.line = line;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<ProductEntity> getProducts() {
        return products;
    }

    public void setProducts(List<ProductEntity> products) {
        this.products = products;
    }
}
