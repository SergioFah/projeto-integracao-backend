package com.sergiofah;

import com.sergiofah.controller.ProductDAO;
import com.sergiofah.model.Category;
import com.sergiofah.model.Line;
import com.sergiofah.model.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class Main {
    public static void main(String[] args){

        /*
        Line ares = new Line("Ares");
        entityManager.persist(ares);
        Category aresTB = new Category(ares, "Ares TB");
        entityManager.persist(aresTB);
        Product product = new Product(ares, aresTB, "Ares 6021L", "PlaceHolder", "teste");
        entityManager.persist(product);


        Category aresTH = new Category(ares, "Ares TH");
        entityManager.persist(aresTH);
        Product product2 = new Product(ares, aresTH, "Ares 8000", "PlaceHolder", "teste");
        entityManager.persist(product2);

        entityManager.getTransaction().commit();

         */
    }
}