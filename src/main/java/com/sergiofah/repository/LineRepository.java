package com.sergiofah.repository;

import com.sergiofah.model.Category;
import com.sergiofah.model.Line;
import com.sergiofah.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface LineRepository extends CrudRepository<Line, Long> {

}
