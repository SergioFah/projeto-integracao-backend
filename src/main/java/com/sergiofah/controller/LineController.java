package com.sergiofah.controller;

import com.sergiofah.dto.LineDTO;
import com.sergiofah.service.LineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lines")
public class LineController {

    @Autowired
    private LineService lineService;

    @GetMapping
    public List<LineDTO> getLines() {
       return lineService.getLines();
    }

}
