package com.sergiofah.model;

public enum Category {
    OLD(" Old", Line.CRONOS),
    L(" L", Line.CRONOS),
    NG("-NG", Line.CRONOS),
    TB(" TB", Line.ARES),
    THS(" THS", Line.ARES);

    private final String category;
    private final Line line;
    Category (String category, Line line) {
        this.category = category;
        this.line = line;
    }
    public String getCategory() {
        return line.getLine() + category;
    }
}
