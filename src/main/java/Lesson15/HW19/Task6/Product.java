package Lesson15.HW19.Task6;

import java.time.LocalDate;

public class Product {
    private int id;
    private String type;
    private double price;
    private boolean discount;
    private LocalDate createDate;

    public Product(int id, String type, double price, boolean discount, LocalDate createDate) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.createDate = createDate;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
    public boolean isDiscount() {
        return discount;
    }
    public LocalDate getCreateDate() {
        return createDate;
    }

}
