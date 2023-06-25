package Lesson15.HW19.Task4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import static Lesson15.HW19.Task4.Task4.getThreeLatestProducts;


public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Book", 50, true, LocalDate.of(2023, 12, 1)));
        products.add(new Product("Book", 70, true, LocalDate.of(2023, 3, 10)));
        products.add(new Product("Laptop", 1000, false, LocalDate.of(2023, 2, 20)));
        products.add(new Product("Phone", 800, true, LocalDate.of(2023, 4, 5)));

        List<Product> i = getThreeLatestProducts(products);
        System.out.println(i);
    }






}


