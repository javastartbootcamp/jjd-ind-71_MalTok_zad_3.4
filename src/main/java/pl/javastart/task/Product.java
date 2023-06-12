package pl.javastart.task;

public class Product {
    String name;
    double price;
    String description;
    Category category;

    public Product(String n, double p, String d, Category c) {
        name = n;
        price = p;
        description = d;
        category = c;
    }

    public Product(String n, double p, String d) {
        name = n;
        price = p;
        description = d;
    }

    String getFullInfo() {
        return name + ", " + description + ", " + price + "zł, " + category.getCategoryInfo();
    }

    String getInfoWithoutCategory() {
        return name + ", " + description + ", " + price + "zł";
    }
}
