package Lesson15.HW19.Task1;

import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static List<Product> getProducts (List<Product> products) {
        return products.stream()
                .filter(product -> product.getType().equals("Book"))
                .filter(product -> product.getPrice() > 250)
                .collect(Collectors.toList());
    }

}
