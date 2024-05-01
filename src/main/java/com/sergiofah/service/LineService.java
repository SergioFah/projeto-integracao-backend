package com.sergiofah.service;


import com.sergiofah.dto.LineDTO;
import com.sergiofah.model.Line;
import com.sergiofah.repository.LineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LineService {

    @Autowired
    private LineRepository lineRepository;

    public List<LineDTO> getLines() {
        return lineRepository
                .findAll()
                .stream()
                .map(this::convertLineToDTO)
                .collect(Collectors.toList());
    }

    private LineDTO convertLineToDTO(Line line) {
        LineDTO lineDTO = new LineDTO();
        lineDTO.setId(line.getId());
        lineDTO.setLine(line.getLine());
        return lineDTO;
    }

}
