package com.sergiofah.controller;

import com.sergiofah.model.Category;
import com.sergiofah.model.Line;
import com.sergiofah.model.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProductDAO {
    private static EntityManager entityManager;

    public ProductDAO() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("projeto-integracao-backend");
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
    }

    public List<String> getLines(){
        TypedQuery<Line> linesQuery = entityManager.createQuery("SELECT l FROM Line l", Line.class);
        return linesQuery.getResultList().stream().map(Line::getLine).collect(Collectors.toList());
    }

    public List<Category> getCategoriesFromLine(String line){
        TypedQuery<Category> categoriesQuery = entityManager.createQuery("SELECT c FROM Category c WHERE c.line.line = :l", Category.class);
        categoriesQuery.setParameter("l", line);
        return categoriesQuery.getResultList();
    }

    public List<Product> getProductListFromCategory(Category category) {
        TypedQuery<Product> productsQuery = entityManager.createQuery("SELECT p FROM Product p WHERE p.category = :cat", Product.class);
        productsQuery.setParameter("cat", category);
        return productsQuery.getResultList();
    }

    public Optional<Product> getProductFromModel(String productName) {
        TypedQuery<Product> productQuery = entityManager.createQuery("SELECT p FROM Product p WHERE p.model = :productName", Product.class);
        productQuery.setParameter("productName", productName);
        return productQuery.getResultList().stream().findFirst();
    }

}
