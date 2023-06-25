package Lesson15.HW19.Task5;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static double calculateTotalCost (List<Product> products) {
        LocalDate currentDate = LocalDate.now();
        double totalCost = products.stream()
                .filter(product -> product.getAdditionDate().toLocalDate().getYear() == currentDate.getYear())
                .filter(product -> product.getType().equals("Book"))
                .filter(product -> product.getPrice() <= 75)
                .mapToDouble(Product::getPrice)
                .sum();

                return totalCost;

    }
}
