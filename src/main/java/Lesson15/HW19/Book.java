package Lesson15.HW19;

import java.time.LocalDate;
import java.util.Objects;

public class Book {
    private int id;
    private String type;
    private double price;
    private boolean discountApplicable;
    private LocalDate createDate;

    public Book(int id, String type, double price, boolean discount, LocalDate createDate) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.discountApplicable = discount;
        this.createDate = createDate;
    }



    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDiscountApplicable() {
        return discountApplicable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && Double.compare(book.price, price) == 0 &&
                discountApplicable == book.discountApplicable && Objects.equals(type, book.type) &&
                Objects.equals(createDate, book.createDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, price, discountApplicable, createDate);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", discount=" + discountApplicable +
                ", createDate=" + createDate +
                '}';
    }
}
