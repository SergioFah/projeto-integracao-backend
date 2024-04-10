package com.sergiofah.model;

import java.util.Arrays;
import java.util.stream.Stream;

public enum Line {
    CRONOS("Cronos"),
    ARES("Ares");

    private final String line;
    Line(String line) {
        this.line = line;
    }
    public String getLine() {
        return line;
    }

}
