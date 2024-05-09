package com.sergiofah.service;

import com.sergiofah.dto.CategoryDTO;
import com.sergiofah.model.Category;
import com.sergiofah.model.Line;
import com.sergiofah.repository.CategoryRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class CategoryServiceTest {

    @Mock
    private CategoryRepository categoryRepository;

    @InjectMocks
    private CategoryService categoryService;

    @Test
    void getCategoriesWithSuccessWhenReturnNotNull_Id() {
        Long id = 1L;
        Line line = Line.builder().id(1L).line("line").build();
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(Category.builder().id(id).line(line).category("category1").build());

        when(categoryRepository.findByLineId(Mockito.anyLong())).thenReturn(categoryList);

        List<CategoryDTO> resultList = categoryService.getCategories(id);

        verify(categoryRepository, times(1)).findByLineId(id);

        Assertions.assertThat(resultList).isNotNull();
    }
    @Test
    void getCategoriesWithSuccessWhenReturnNotNull() {
        Line line = Line.builder().id(1L).line("line").build();
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(Category.builder().line(line).category("category1").build());

        when(categoryRepository.findAll()).thenReturn(categoryList);

        List<CategoryDTO> resultList = categoryService.getCategories(null);

        verify(categoryRepository, times(1)).findAll();

        Assertions.assertThat(resultList).isNotNull();
    }

    @Test
    void getCategoriesWithSuccessWhenAssertValues_Id() {
        Long id = 1L;
        Line line = Line.builder().id(1L).line("line").build();
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(Category.builder().id(id).line(line).category("category1").build());

        when(categoryRepository.findByLineId(Mockito.anyLong())).thenReturn(categoryList);

        List<CategoryDTO> resultList = categoryService.getCategories(id);

        verify(categoryRepository, times(1)).findByLineId(id);

        assertEquals(categoryList.get(0).getCategory(), resultList.get(0).getCategory());
    }

    @Test
    void getCategoriesWithSuccessWhenAssertValues() {
        Line line = Line.builder().id(1L).line("line").build();
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(Category.builder().line(line).category("category1").build());

        when(categoryRepository.findAll()).thenReturn(categoryList);

        List<CategoryDTO> resultList = categoryService.getCategories(null);

        verify(categoryRepository, times(1)).findAll();

        assertEquals(categoryList.get(0).getCategory(), resultList.get(0).getCategory());
    }
}