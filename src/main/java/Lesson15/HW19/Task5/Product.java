package Lesson15.HW19.Task5;

import java.time.LocalDateTime;

public class Product {
    private String type;
    private double price;
    private LocalDateTime additionDate;

    public Product(String type, double price, LocalDateTime additionDate) {
        this.type = type;
        this.price = price;
        this.additionDate = additionDate;

    }


    public LocalDateTime getAdditionDate() {
        return additionDate;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
    public boolean isDiscountApplicable() {
        return true;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", additionDate=" + additionDate +
                '}';
    }
}

