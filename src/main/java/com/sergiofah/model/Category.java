package com.sergiofah.model;
import com.sergiofah.dto.CategoryDTO;
import com.sergiofah.dto.LineDTO;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "line_id")
    private Line line;

    @Column(name = "category", unique = true)
    private String category;

    @OneToMany(mappedBy = "category")
    private List<Product> products;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null) return false;

        if(object.getClass() == CategoryDTO.class){
            CategoryDTO categoryDTO = (CategoryDTO) object;
            return this.id.equals(categoryDTO.getId()) && (this.category.equals(categoryDTO.getCategory())) && (this.line.getId().equals(categoryDTO.getLineId()));
        }
        return false;
    }
}
