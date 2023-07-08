package org.example.StrategyPattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void calculateAreaFirst() {
        assertEquals(56, new Rectangle(7, 8).calculateArea());
    }
    @Test
    void calculateAreaSecond() {
        assertEquals(108, new Rectangle(12, 9).calculateArea());
    }
}

