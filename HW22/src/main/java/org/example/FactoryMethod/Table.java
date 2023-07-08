package org.example.FactoryMethod;

public class Table implements Furniture{
    @Override
    public void production() {
        System.out.println("Create a table");
    }
}
