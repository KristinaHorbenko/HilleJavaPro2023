package org.example.BuilderPattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcreteCarBuilderTest {

    @Test
    void buildEngine() {
        ConcreteCarBuilder carBuilder = new ConcreteCarBuilder();
        carBuilder.buildEngine();
        Car car = carBuilder.getCar();
        assertEquals("Engine", car.getEngine());
    }

    @Test
    void buildWheels() {
        ConcreteCarBuilder carBuilder = new ConcreteCarBuilder();
        carBuilder.buildWheels();
        Car car = carBuilder.getCar();
        assertEquals("Wheels", car.getWheels());
    }

    @Test
    void buildBody() {
        ConcreteCarBuilder carBuilder = new ConcreteCarBuilder();
        carBuilder.buildBody();
        Car car = carBuilder.getCar();
        assertEquals("Body", car.getBody());
    }

    @Test
    void getCar() {
        ConcreteCarBuilder carBuilder = new ConcreteCarBuilder();
        Car car = carBuilder.getCar();
        assertNotNull(car);

    }
}