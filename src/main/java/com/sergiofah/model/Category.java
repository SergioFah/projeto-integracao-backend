package com.sergiofah.model;

public enum Category {
    OLD("Cronos Old", Line.CRONOS),
    L("Cronos L", Line.CRONOS),
    NG("Cronos-NG", Line.CRONOS),
    TB("Ares TB", Line.ARES),
    THS("Ares THS", Line.ARES);

    private final String category;
    private final Line line;
    Category (String category, Line line) {
        this.category = category;
        this.line = line;
    }
    public String getCategory() {
        return category;
    }
    public String getLine(){
        return line.getLine();
    }
}
