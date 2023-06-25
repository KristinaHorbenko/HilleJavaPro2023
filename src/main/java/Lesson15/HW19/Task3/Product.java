package Lesson15.HW19.Task3;

public class Product {
    private String type;
    private double price;

    public Product(String type, double price) {
        this.type = type;
        this.price = price;

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
}