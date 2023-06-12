package pl.javastart.task;

public class SpecialOffer {
    Product product;
    String description;
    String validityPeriod;
    double discount;

    public SpecialOffer(Product p, String d, String v, double dis) {
        product = p;
        description = d;
        validityPeriod = v;
        discount = dis;
    }

    String getInfo() {
        return "Aktualna promocja: " + product.name + " - " + product.description + ", " + description + ", obowiązuje: " + validityPeriod
                + ", rabat " + discount * 100 + "%";
    }
}
