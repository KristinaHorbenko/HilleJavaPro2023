package Lesson15.HW19.Task2;

import java.util.ArrayList;
import java.util.List;

import static Lesson15.HW19.Task2.Task2.getProducts;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Book",  200));
        products.add(new Product("Book", 300));
        products.add(new Product("Book", 150));
        products.add(new Product("Phone", 500));

        List<Product> books = getProducts(products);

        for (Product book : books) {
            System.out.println("Category: " + book.getType() + ", Price: " + book.getPrice());
        }
    }
}
