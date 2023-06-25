package Lesson15.HW19.Task5;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static Lesson15.HW19.Task5.Task5.calculateTotalCost;


public class Main {
    public static void main(String[] args) {
        // Task4
        List<Product> products = new ArrayList<>();
        products.add(new Product("Book", 200,  LocalDateTime.now().minusDays(2)));
        products.add(new Product("Book", 345,  LocalDateTime.now().minusDays(1)));
        products.add(new Product("Book", 175,  LocalDateTime.now()));
        products.add(new Product("Book", 420,  LocalDateTime.now()));
        products.add(new Product("Book", 54,  LocalDateTime.now()));
        products.add(new Product("Book", 67,  LocalDateTime.now()));

        double totalCost = calculateTotalCost(products);
        System.out.println(totalCost);








    }
}
