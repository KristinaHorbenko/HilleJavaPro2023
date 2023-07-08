package org.example.StrategyPattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void calculateAreaFirst() {
        assertEquals(12.5, new Triangle(5, 5).calculateArea());
    }

    @Test
    void calculateAreaSecond() {
        assertEquals(48, new Triangle(8, 12).calculateArea());
    }
}