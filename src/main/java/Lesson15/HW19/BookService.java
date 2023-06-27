package Lesson15.HW19;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;



public class BookService {
    public static List<Book> getBook (List<Book> books) {
        return books.stream()
                .filter(book -> book.getType().equals("Book"))
                .filter(book -> book.getPrice() > 250)
                .collect(Collectors.toList());
    }

    public static List<Book> getDiscount(List<Book> books, double  discount) {
        return books.stream()
                .filter(book -> book.getType().equals("Book")  && book.isDiscountApplicable())
                .map(book -> {
                    double discountedPrice = 0;
                    if (book.isDiscountApplicable()) {

                        discountedPrice = book.getPrice() - book.getPrice() * discount / 100;
                        book.setPrice(discountedPrice);

                    }
                    return book;
                })
                .collect(Collectors.toList());
             }

    public static List<Book> getCheapestBook (List<Book> books) throws BookException {
        Optional<Book> cheapestBook = books.stream()
                .filter(book -> book.getType().equals("Book"))
                .min(Comparator.comparing(Book::getPrice));


        return cheapestBook.map(Collections::singletonList)
                .orElseThrow(() -> new BookException
                        ("Продукт Book не знайдено "));
    }
    public static double calculateTotalCost (List<Book> books) {
        LocalDate currentDate = LocalDate.now();
        double totalCost = books.stream()
                .filter(book -> book.getCreateDate().getYear() == currentDate.getYear())
                .filter(book -> book.getType().equals("Book"))
                .filter(book -> book.getPrice() <= 75)
                .mapToDouble(Book::getPrice)
                .sum();

        return totalCost;

    }
    public static Map<String, List<Book>> groupProductsByType(List<Book> books) {
        return books.stream()
                .collect(Collectors.groupingBy(Book::getType));

    }
}
