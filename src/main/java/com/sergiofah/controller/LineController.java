package com.sergiofah.controller;

import com.sergiofah.model.Line;
import com.sergiofah.model.Product;
import com.sergiofah.repository.LineRepository;
import com.sergiofah.repository.ProductRepository;
import javafx.scene.shape.HLineTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/line")
public class LineController {

    @Autowired
    private final LineRepository lineRepository;

    public LineController(LineRepository lineRepository) {
        this.lineRepository = lineRepository;
    }
    @GetMapping
    public Iterable<Line> getLines(){
       return lineRepository.findAll();
    }

}
