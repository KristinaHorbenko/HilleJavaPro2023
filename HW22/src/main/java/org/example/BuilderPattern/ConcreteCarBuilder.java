package org.example.BuilderPattern;

public class ConcreteCarBuilder implements CarBuilder{
    private Car car;

    public ConcreteCarBuilder() {
        this.car = new Car();
    }
    @Override
    public void buildEngine() {
        car.setEngine("Engine");

    }

    @Override
    public void buildWheels() {
        car.setWheels("Wheels");

    }

    @Override
    public void buildBody() {
        car.setBody("Body");
    }

    @Override
    public Car getCar() {
        return car;
    }
}
