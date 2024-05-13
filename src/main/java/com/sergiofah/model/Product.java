package com.sergiofah.model;

import com.sergiofah.dto.CategoryDTO;
import com.sergiofah.dto.ProductDTO;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "line_id")
    private Line line;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name = "model", unique = true)
    private String model;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "image_url")
    private String imageUrl;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null) return false;

        if(object.getClass().equals(ProductDTO.class)){
            ProductDTO productDTO = (ProductDTO) object;
            return this.id.equals(productDTO.getId()) && (this.category.getId().equals(productDTO.getCategoryId()))
                    && (this.line.getId().equals(productDTO.getLineId()))
                    && (this.model.equals(productDTO.getModel()))
                    && (this.description.equals(productDTO.getDescription())
                    && (this.imageUrl.equals(productDTO.getImageUrl())));
        }
        return false;
    }
}
