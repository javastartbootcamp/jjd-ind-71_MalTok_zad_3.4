package pl.javastart.task;

public class Category {
    String name;
    String description;

    public Category(String n, String d) {
        name = n;
        description = d;
    }

    String getCategoryInfo() {
        return name + " - " + description;
    }
}
