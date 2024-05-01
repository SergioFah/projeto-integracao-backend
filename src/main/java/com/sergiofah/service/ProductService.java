package com.sergiofah.service;

import com.sergiofah.dto.ProductDTO;
import com.sergiofah.model.Product;
import com.sergiofah.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductDTO> getProductFromCategoryId(Long id) {
        return this.productRepository
                .findByCategoryId(id)
                .stream()
                .map(this::convertProductToDTO)
                .collect(Collectors.toList());
    }

    public ProductDTO getProductById(Long id) {
        return convertProductToDTO(this.productRepository
                .findById(id)
                .get());
    }

    private ProductDTO convertProductToDTO(Product product) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(product.getId());
        productDTO.setModel(product.getModel());
        productDTO.setLineId(product.getLine().getId());
        productDTO.setCategoryId(product.getCategory().getId());
        productDTO.setDescription(product.getDescription());
        productDTO.setImageUrl(product.getImageUrl());
        return productDTO;
    }
}
