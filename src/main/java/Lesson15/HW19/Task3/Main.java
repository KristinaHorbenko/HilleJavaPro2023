package Lesson15.HW19.Task3;

import java.util.ArrayList;
import java.util.List;

import static Lesson15.HW19.Task3.Task3.cheapestProduct;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Book", 200));
        products.add(new Product("Book", 300));
        products.add(new Product("Book", 150));
        products.add(new Product("Phone", 500));

        try {
            List<Product> cheapestBooks = cheapestProduct(products);
            if (!cheapestBooks.isEmpty()) {
                System.out.println("Найдешевша книга: ");
                for (Product book : cheapestBooks) {
                    System.out.println(book.getType() + " " + book.getPrice());
                }
            } else {
                System.out.println("Продукт не знайдено");
            }
        } catch (BookException e) {
            System.out.println(e.getMessage());
        }
    }
}
