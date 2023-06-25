package Lesson15.HW19.Task6;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task6 {
    public static Map<String, List<Product>> groupProductsByType(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getType));

    }
}
