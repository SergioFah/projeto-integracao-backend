package com.sergiofah.service;

import com.sergiofah.dto.CategoryDTO;
import com.sergiofah.model.Category;
import com.sergiofah.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<CategoryDTO> getCategories(Long id) {
        if(id != null)
            return this.categoryRepository
                    .findByLineId(id)
                    .stream()
                    .map(this::convertCategoryToDTO)
                    .collect(Collectors.toList());
        else {
            return this.categoryRepository.findAll()
                    .stream()
                    .map(this::convertCategoryToDTO)
                    .collect(Collectors.toList());
        }
    }

    private CategoryDTO convertCategoryToDTO(Category category) {
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setCategory(category.getCategory());
        categoryDTO.setId(category.getId());
        categoryDTO.setLineId(category.getLine().getId());
        return categoryDTO;
    }

}
