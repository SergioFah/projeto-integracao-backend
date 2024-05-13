package com.sergiofah.service;

import com.sergiofah.dto.CategoryDTO;
import com.sergiofah.model.Category;
import com.sergiofah.model.Line;
import com.sergiofah.repository.CategoryRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.*;
import static org.springframework.test.util.AssertionErrors.assertEquals;


@ExtendWith(MockitoExtension.class)
class CategoryServiceTest {

    @Mock
    private CategoryRepository categoryRepository;

    @InjectMocks
    private CategoryService categoryService;

    @Test
    public void getCategoriesTest01() {
        //Given
        Long id = 1L;
        Line line = Line.builder().id(1L).line("line").build();
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(Category.builder().id(id).line(line).category("category1").build());

        //When
        when(categoryRepository.findByLineId(Mockito.anyLong())).thenReturn(categoryList);
        List<CategoryDTO> resultList = categoryService.getCategories(id);

        //Then
        verify(categoryRepository, times(1)).findByLineId(id);
        assertArrayEquals(categoryList.toArray(), resultList.toArray());
    }

    @Test
    public void getCategoriesTest02() {
        //Given
        Long id = 1L;
        Line line = Line.builder().id(1L).line("line").build();
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(Category.builder().id(id).line(line).category("category1").build());

        //When
        when(categoryRepository.findAll()).thenReturn(categoryList);
        List<CategoryDTO> resultList = categoryService.getCategories(null);

        //Then
        verify(categoryRepository, times(1)).findAll();
        assertArrayEquals(categoryList.toArray(), resultList.toArray());
    }
}