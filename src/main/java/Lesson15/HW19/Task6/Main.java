package Lesson15.HW19.Task6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static Lesson15.HW19.Task6.Task6.groupProductsByType;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Book", 100, false, LocalDate.of(2022, 1, 1)));
        products.add(new Product(2, "Toy", 200, true, LocalDate.of(2022, 1, 1)));
        products.add(new Product(3, "Book", 150, true, LocalDate.of(2022, 1, 1)));
        products.add(new Product(4, "Toy", 120, false, LocalDate.of(2022, 1, 1)));

        Map<String, List<Product>> groupedProducts = groupProductsByType(products);

        for (Map.Entry<String, List<Product>> entry : groupedProducts.entrySet()) {
            String type = entry.getKey();
            List<Product> productList = entry.getValue();

            System.out.println(type + ": ");
            for (Product product : productList) {
                System.out.println("Type: " + product.getType() + ", Price: " + product.getPrice() + ", Discount: " + product.isDiscount() + ", Create Date: " + product.getCreateDate());
            }
            System.out.println();
        }
    }
}
