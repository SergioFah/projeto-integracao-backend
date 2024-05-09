package com.sergiofah.service;

import com.sergiofah.dto.ProductDTO;
import com.sergiofah.model.Category;
import com.sergiofah.model.Line;
import com.sergiofah.model.Product;
import com.sergiofah.repository.ProductRepository;
import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    @Test
    void getProductsFromCategoryIdWithSuccessWhenReturnNotNull() {
        Long category_id = 1L;
        Line line = Line.builder().id(1L).line("line").build();
        Category category = Category.builder().id(category_id).category("category").line(line).build();
        List<Product> productList = new ArrayList<>();
        productList.add(Product.builder().model("model").line(line).category(category).imageUrl("url").description("descr").build());
        when(productRepository.findByCategoryId(Mockito.anyLong())).thenReturn(productList);

        List<ProductDTO> resultList = productService.getProductFromCategoryId(category_id);

        verify(productRepository, times(1)).findByCategoryId(category_id);
        Assertions.assertThat(resultList).isNotNull();
    }

    @Test
    void getProductsFromCategoryIdWithSuccessWhenAssertCategory() {
        Long category_id = 1L;
        Line line = Line.builder().id(1L).line("line").build();
        Category category = Category.builder().id(category_id).category("category").line(line).build();
        List<Product> productList = new ArrayList<>();
        productList.add(Product.builder().model("model").line(line).category(category).imageUrl("url").description("descr").build());
        when(productRepository.findByCategoryId(Mockito.anyLong())).thenReturn(productList);

        List<ProductDTO> resultList = productService.getProductFromCategoryId(category_id);

        verify(productRepository, times(1)).findByCategoryId(category_id);
        assertEquals(productList.get(0).getCategory().getId(), resultList.get(0).getCategoryId());
    }

    @Test
    void getProductByIdWithSuccessWhenReturnNotNull() {
        Long id = 1L;
        Line line = Line.builder().line("line").build();
        Category category = Category.builder().category("category").line(line).build();
        Optional<Product> product = Optional.ofNullable(Product.builder().model("model").line(line).category(category).imageUrl("url").description("descr").build());
        when(productRepository.findById(Mockito.anyLong())).thenReturn(product);

        ProductDTO productResult = productService.getProductById(id);

        verify(productRepository, times(1)).findById(id);
        Assertions.assertThat(productResult).isNotNull();
    }

    @Test
    void getProductByIdWithSuccessWhenAssertValue() {
        Long id = 1L;
        Line line = Line.builder().line("line").build();
        Category category = Category.builder().category("category").line(line).build();
        Optional<Product> product = Optional.ofNullable(Product.builder().model("model").line(line).category(category).imageUrl("url").description("descr").build());
        when(productRepository.findById(Mockito.anyLong())).thenReturn(product);

        ProductDTO productResult = productService.getProductById(id);

        verify(productRepository, times(1)).findById(id);
        assertEquals(product.get().getModel(), productResult.getModel());
    }
}