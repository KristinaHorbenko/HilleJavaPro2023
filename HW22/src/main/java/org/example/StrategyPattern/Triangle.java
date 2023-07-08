package org.example.StrategyPattern;

public class Triangle implements AreaCalculation {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        double area = base * height / 2;
        System.out.println("Площа трикутника: " + area );
        return area;
    }
}
