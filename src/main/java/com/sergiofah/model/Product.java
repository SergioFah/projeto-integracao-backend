package com.sergiofah.model;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Product{
    CRONOS_6001_A(Line.CRONOS, Category.OLD, "Cronos 6001-A", "Lorem ipsum dolor", "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/CRONOS-6001-A-2.png"),
    CRONOS_6003(Line.CRONOS, Category.OLD, "Cronos 6003", "Lorem ipsum dolor", "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/CRONOS-6001-A-2.png"),
    CRONOS_7023(Line.CRONOS, Category.OLD, "Cronos 7023", "Lorem ipsum dolor", "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/CRONOS-6001-A-2.png"),
    CRONOS_6021L(Line.CRONOS, Category.L, "Cronos 6021L", "Lorem ipsum dolor", "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/CRONOS-6001-A-2.png"),
    CRONOS_6031L(Line.CRONOS, Category.L, "Cronos 6031L", "Lorem ipsum dolor", "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/CRONOS-6001-A-2.png"),
    CRONOS_7023L(Line.CRONOS, Category.L, "Cronos 7023L", "Lorem ipsum dolor", "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/CRONOS-6001-A-2.png"),
    CRONOS_6003_NG(Line.CRONOS, Category.NG, "Cronos 6003-NG", "Lorem ipsum dolor", "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/CRONOS-6001-A-2.png"),
    CRONOS_6021_NG(Line.CRONOS, Category.NG, "Cronos 6021-NG", "Lorem ipsum dolor", "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/CRONOS-6001-A-2.png"),
    CRONOS_6031_NG(Line.CRONOS, Category.NG, "Cronos 6031-NG", "Lorem ipsum dolor", "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/CRONOS-6001-A-2.png"),
    CRONOS_7021_NG(Line.CRONOS, Category.NG, "Cronos 7021-NG", "Lorem ipsum dolor", "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/CRONOS-6001-A-2.png"),
    CRONOS_7023_NG(Line.CRONOS, Category.NG, "Cronos 7023-NG", "Lorem ipsum dolor", "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/CRONOS-6001-A-2.png"),
    CRONOS_6001_NG(Line.CRONOS, Category.NG, "Cronos 6001-NG", "Lorem ipsum dolor", "https://www.eletraenergy.com.br/wp-content/uploads/2022/09/CRONOS-6001-A-2.png"),

    ARES_7021(Line.ARES, Category.TB, "Ares 7021", "Lorem ipsum dolor","https://www.eletraenergy.com.br/wp-content/uploads/2022/09/ARES-7021.png" ),
    ARES_7031(Line.ARES, Category.TB, "Ares 7031", "Lorem ipsum dolor","https://www.eletraenergy.com.br/wp-content/uploads/2022/09/ARES-7031.png" ),
    ARES_7023(Line.ARES, Category.TB, "Ares 7023", "Lorem ipsum dolor","https://www.eletraenergy.com.br/wp-content/uploads/2022/09/Ares-7023.png" ),
    ARES_8023_15(Line.ARES, Category.THS, "Ares 8023 15", "Lorem ipsum dolor","https://www.eletraenergy.com.br/wp-content/uploads/2022/09/Ares-8023-15.png" ),
    ARES_8023_200(Line.ARES, Category.THS, "Ares 8023 200", "Lorem ipsum dolor","https://www.eletraenergy.com.br/wp-content/uploads/2022/09/Ares-8023-200.png" ),
    ARES_8023_25(Line.ARES, Category.THS, "Ares 8023 2,5", "Lorem ipsum dolor","https://www.eletraenergy.com.br/wp-content/uploads/2022/09/Ares-8023-15.png" );

    private final Line line;
    private final Category category;
    private final String model;
    private final String desc;
    private final String imageUrl;

    Product(Line line, Category category, String model, String desc, String imageUrl) {
        this.line = line;
        this.category = category;
        this.model = model;
        this.desc = desc;
        this.imageUrl = imageUrl;
    }

    public Line getLine() {
        return line;
    }

    public Category getCategory() {
        return category;
    }

    public String getModel() {
        return model;
    }

    public String getDesc() {
        return desc;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public static List<String> getLines(){
        Stream<String> listString = Arrays.stream(Line.values()).
                map(Line::getLine);
        return listString.collect(Collectors.toList());
    }

    public static List<Category> getCategories(){
        Stream<Category> categories = Arrays.stream(Category.values());
        return categories.collect(Collectors.toList());
    }
    public static List<Product> getProductListFromCategory(Category category){
        return Arrays.stream(Product.values()).filter(p -> p.getCategory().equals(category)).collect(Collectors.toList());
    }
    public static Optional<Product> getProductFromModel(String productName){
        return Arrays.stream(Product.values()).filter(p -> p.getModel().equals(productName)).findFirst();
    }

}