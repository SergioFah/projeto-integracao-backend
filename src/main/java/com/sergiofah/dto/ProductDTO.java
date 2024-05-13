package com.sergiofah.dto;

import lombok.Builder;
import lombok.Data;

@Data
public class ProductDTO {
    private Long id;
    private Long lineId;
    private Long categoryId;
    private String model;
    private String description;
    private String imageUrl;
}
