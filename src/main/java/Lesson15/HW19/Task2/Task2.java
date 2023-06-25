package Lesson15.HW19.Task2;

import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    private static final double discount = 0.1;
    public static List<Product> getProducts(List<Product> products) {
        return products.stream()
                .filter(product -> product.getType().equals("Book"))
                .map(product -> {
                    if(product.isDiscountApplicable()) {
                        double discountedPrice = product.getPrice() - product.getPrice() * discount; // 10% знижка
                        product.setPrice(discountedPrice);
                    }
                    return product;
                })
                .collect(Collectors.toList());
    }
}
