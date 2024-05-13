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
    public void getProductFromCategoryTest01() {
        //Given
        Long id = 1L;

        //When
        productController.getProductFromCategory(id);

        //Then
        verify(productService, times(1)).getProductFromCategoryId(id);
    }

    @Test
    public void getProductFromModelTest01() {
        //Given
        Long id = 1L;

        //When
        productController.getProductFromModel(id);

        //Then
        verify(productService, times(1)).getProductById(id);
    }
}