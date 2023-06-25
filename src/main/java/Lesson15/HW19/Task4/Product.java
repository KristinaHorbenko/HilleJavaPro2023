package Lesson15.HW19.Task4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Product {
    private String type;
    private double price;
    private boolean discountAvailable;
    private LocalDate dateAdded;

    public Product(String type, double price, boolean discountAvailable, LocalDate dateAdded) {
        this.type = type;
        this.price = price;
        this.discountAvailable = discountAvailable;
        this.dateAdded = dateAdded;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDiscountAvailable() {
        return discountAvailable;
    }
    public LocalDate getDateAdded() {
        return dateAdded;
    }

    @Override
    public String toString() {
        return  " Type: " + type +
                " Price: " + price +
                " Discount: " + discountAvailable +
                " Date Added: " + dateAdded +
                " \n";
    }
 }
