package com.sergiofah.dto;
import lombok.Builder;
import lombok.Data;

@Data
public class CategoryDTO {
    private Long id;
    private Long lineId;
    private String category;
}
