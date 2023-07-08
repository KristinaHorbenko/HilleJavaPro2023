package org.example.BuilderPattern;

interface CarBuilder {
    void buildEngine();
    void buildWheels();
    void buildBody();
    Car getCar();
}

