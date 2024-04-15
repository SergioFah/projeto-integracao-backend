package com.sergiofah.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "line")
public class LineEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "line", unique = true)
    private String line;

    @OneToMany(mappedBy = "line")
    private List<CategoryEntity> categories;

    public LineEntity() {
    }

    public LineEntity(String line) {
        this.line = line;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

}
