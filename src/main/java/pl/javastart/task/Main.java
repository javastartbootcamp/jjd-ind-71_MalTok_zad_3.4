package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Category category1 = new Category("Ubrania", "Koszulki letnie damskie");
        Category category2 = new Category("Nakrycia głowy", "Czapki i kapelusze unisex");

        Product product1 = new Product("T-shirt", 29.90, "Koszulka z Myszką Miki", category1);
        Product product2 = new Product("T-shirt", 18.90, "Koszulka biała", category1);
        Product product3 = new Product("Sandały", 69.80, "Sandały robocze czarne");
        Product product4 = new Product("Czapka", 35, "Czapka zimowa z pomponem", category2);

        SpecialOffer specialOffer = new SpecialOffer(product4, "Posezonowa obniżka cen",
                "od 01.06.2023 do 15.07.2023", 0.2);

        System.out.println(product1.getFullInfo());
        System.out.println(product2.getFullInfo());
        System.out.println(product3.getInfoWithoutCategory());
        System.out.println(product4.getFullInfo());

        System.out.println(specialOffer.getInfo());
    }
}
