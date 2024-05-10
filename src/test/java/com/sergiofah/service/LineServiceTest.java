package com.sergiofah.service;

import com.sergiofah.dto.LineDTO;
import com.sergiofah.model.Category;
import com.sergiofah.model.Line;
import com.sergiofah.repository.LineRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import static org.springframework.test.util.AssertionErrors.assertEquals;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class LineServiceTest {

    @Mock
    private LineRepository lineRepository;

    @InjectMocks
    private LineService lineService;

    @Test
    public void getLinesWithSuccessWhenAssertValues() {
        List<Line> lineList = new ArrayList<>();
        lineList.add(Line.builder().id(1L).line("line1").build());
        lineList.add(Line.builder().id(2L).line("line2").build());

        when(lineRepository.findAll()).thenReturn(lineList);
        List<LineDTO> resultList = lineService.getLines();

        verify(lineRepository, times(1)).findAll();

        Assertions.assertThat(resultList).isNotNull();
        assertArrayEquals(lineList.toArray(),resultList.toArray());
    }
}