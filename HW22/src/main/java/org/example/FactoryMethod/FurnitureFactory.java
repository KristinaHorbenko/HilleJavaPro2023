package org.example.FactoryMethod;

public class FurnitureFactory {
    public static Furniture createFurniture(String type) {
        if (type.equalsIgnoreCase("chair")) {
            return new Chair();
        } else if (type.equalsIgnoreCase("sofa")) {
            return new Sofa();
        } else if (type.equalsIgnoreCase("table")) {
            return new Table();
        } else throw new IllegalArgumentException("Unsupported furniture type.");
    }
}

