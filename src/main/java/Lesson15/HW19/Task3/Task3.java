package Lesson15.HW19.Task3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task3 {
    public static List<Product> cheapestProduct (List<Product> products) throws BookException {
        Optional<Product> cheapestBook = products.stream()
                .filter(product -> product.getType().equals("Book"))
                .min(Comparator.comparing(Product::getPrice));


        return cheapestBook.map(Collections::singletonList)
                .orElseThrow(() -> new BookException
                        ("Продукт Book не знайдено "));
    }
}
