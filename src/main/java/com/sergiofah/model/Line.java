package com.sergiofah.model;

import com.sergiofah.dto.LineDTO;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "line")
public class Line {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "line", unique = true)
    private String line;

    @OneToMany(mappedBy = "line")
    private List<Category> categories;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null) return false;

        if(object.getClass().equals(LineDTO.class)){
            LineDTO lineDTO = (LineDTO) object;
            return this.id.equals(lineDTO.getId()) && (this.line.equals(lineDTO.getLine()));
        }
        return false;
    }
}
