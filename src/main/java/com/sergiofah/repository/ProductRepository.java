package com.sergiofah.repository;

import com.sergiofah.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product, Long> {
    @Query("SELECT p FROM Product p WHERE p.category.id = :id")
    Iterable<Product> getProductListFromCategory(Long id);

    @Query("SELECT p FROM Product p WHERE p.id = :id")
    Optional<Product> getProductFromModel(Long id);
}
