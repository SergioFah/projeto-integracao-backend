package com.sergiofah.controller;

import com.sergiofah.service.LineService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class LineControllerTest {

    @Mock
    private LineService lineService;

    @InjectMocks
    private LineController lineController;

    @Test
    public void getLinesTest01() {
        //When
        lineController.getLines();

        //Then
        verify(lineService, times(1)).getLines();
    }
}