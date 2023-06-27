package Lesson15.HW19;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.*;



import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BookServiceTest {

    @Test
    void getBook() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1,"Book", 200,false, LocalDate.of(2022, 02, 05)));
        books.add(new Book(2,"Book", 73, false, LocalDate.of(2022,07,12)));
        books.add(new Book(3,"Book", 376, false, LocalDate.of(2023,03,11)));
        books.add(new Book(4, "Phone", 300, true, LocalDate.of(2021,04,10)));
        books.add(new Book(5,"Toy", 450, false, LocalDate.of(2023,04,12)));

        List<Book> result = BookService.getBook(books);
        List<Book> expectedResult = new ArrayList<>(Arrays.asList (new Book(3,"Book", 376, false,
                LocalDate.of(2023,03,11))));
        assertEquals(expectedResult, result);
    }

    @Test
    void getDiscount() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Book", 200, false, LocalDate.of(2022, 02, 05)));
        books.add(new Book(2, "Book", 73, true, LocalDate.of(2022, 07, 12)));
        books.add(new Book(3, "Book", 376, true, LocalDate.of(2023, 03, 11)));
        books.add(new Book(4, "Book", 300, true, LocalDate.of(2021, 04, 10)));
        books.add(new Book(5, "Book", 450, false, LocalDate.of(2023, 04, 12)));

        List<Book> discountedBooks = BookService.getDiscount(books, 10);
        assertEquals(3, discountedBooks.size());
        for (Book book : discountedBooks) {
            assertTrue(book.isDiscountApplicable());

        }
    }

    @Test
    void getCheapestBook() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Book", 200, false, LocalDate.of(2022, 02, 05)));
        books.add(new Book(2, "Book", 73, true, LocalDate.of(2022, 07, 12)));
        books.add(new Book(3, "Book", 376, true, LocalDate.of(2023, 03, 11)));
        books.add(new Book(4, "Book", 300, true, LocalDate.of(2021, 04, 10)));
        books.add(new Book(5, "Book", 450, false, LocalDate.of(2023, 04, 12)));

        List<Book> cheapestBook = BookService.getCheapestBook(books);
        assertEquals(1,cheapestBook.size());
        assertEquals(73, cheapestBook.get(0).getPrice());

    }

    @Test
    void calculateTotalCost() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Book", 150, false, LocalDate.of(2022, 02, 05)));
        books.add(new Book(2, "Book", 75, true, LocalDate.of(2023, 07, 12)));
        books.add(new Book(3, "Book", 65, true, LocalDate.of(2023, 03, 11)));
        books.add(new Book(4, "Book", 45, true, LocalDate.of(2023, 04, 10)));
        books.add(new Book(5, "Phone", 450, false, LocalDate.of(2023, 04, 12)));

        double totalCost =  BookService.calculateTotalCost(books);
        assertEquals(185, totalCost);


    }

    @Test
    void groupProductsByType() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Book", 150, false, LocalDate.of(2022, 02, 05)));
        books.add(new Book(2, "Book", 75, true, LocalDate.of(2023, 07, 12)));
        books.add(new Book(3, "Book", 65, true, LocalDate.of(2023, 03, 11)));
        books.add(new Book(3, "Phone", 376, true, LocalDate.of(2023, 03, 11)));
        books.add(new Book(4, "Book", 45, true, LocalDate.of(2023, 04, 10)));
        books.add(new Book(5, "Phone", 450, false, LocalDate.of(2023, 04, 12)));

        Map<String, List<Book>> groupedBooks = BookService.groupProductsByType(books);

        assertEquals(2, groupedBooks.size());
        assertTrue(groupedBooks.containsKey("Book"));
        assertTrue(groupedBooks.containsKey("Phone"));

        List<Book> bookGroup = groupedBooks.get("Book");
        assertEquals(4, bookGroup.size());
        assertEquals("Book", bookGroup.get(0).getType());
        assertEquals("Book", bookGroup.get(1).getType());
        assertEquals("Book", bookGroup.get(2).getType());

        List<Book> phoneGroup = groupedBooks.get("Phone");
        assertEquals(2, phoneGroup.size());
        assertEquals("Phone", phoneGroup.get(0).getType());
        assertEquals("Phone", phoneGroup.get(1).getType());
    }
}