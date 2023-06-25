package Lesson15.HW19.Task4;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    public static List<Product> getThreeLatestProducts (List<Product> products) {
        return products.stream()
                .sorted(Comparator.comparing(Product::getDateAdded).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }
}
