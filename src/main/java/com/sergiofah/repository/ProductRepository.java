package com.sergiofah.repository;

import com.sergiofah.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product, Long> {
    @Query("SELECT p FROM Product p WHERE p.category.category = :cat")
    Iterable<Product> getProductListFromCategory(String cat);

    @Query("SELECT p FROM Product p WHERE p.model = :name")
    Optional<Product> getProductFromModel(String name);
}
