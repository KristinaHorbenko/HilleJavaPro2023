package org.example.StrategyPattern;

public class Rectangle implements AreaCalculation {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        double area = length * width;
        System.out.println("Площа прямокутника: " + area );
        return area;
    }
}
