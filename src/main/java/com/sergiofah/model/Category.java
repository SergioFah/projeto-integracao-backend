package com.sergiofah.model;

public enum Category {
    OLD(" Old"),
    L(" L"),
    NG("-NG"),
    TB(" TB"),
    THS(" THS");

    private final String category;
    Category (String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
