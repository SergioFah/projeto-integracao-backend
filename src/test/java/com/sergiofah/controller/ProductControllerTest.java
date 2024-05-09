package com.sergiofah.controller;

import com.sergiofah.service.ProductService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ProductControllerTest {
    @Mock
    private ProductService productService;

    @InjectMocks
    private ProductController productController;

    @Test
    void getProductFromCategoryWithSuccessWhenVerified() {
        Long id = 1L;
        productController.getProductFromCategory(id);
        verify(productService, times(1)).getProductFromCategoryId(id);
    }

    @Test
    void getProductFromModelWithSuccessWhenVerified() {
        Long id = 1L;
        productController.getProductFromModel(id);
        verify(productService, times(1)).getProductById(id);

    }
}