import java.util.*;
class Product{
    int id;
    String name;
    double price;

    Product() {
        this(0, "Unknown", 0.0);
    }

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void displayDetails() {
        System.out.println(id + " | " + name + " | " + price);
    }

    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product(10977, "Monitor", 80000.0);

        product1.displayDetails();
        product2.displayDetails();
    }
}