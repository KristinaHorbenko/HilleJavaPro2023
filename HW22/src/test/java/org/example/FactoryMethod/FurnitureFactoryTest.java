package org.example.FactoryMethod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FurnitureFactoryTest {

    @Test
    void createFurnitureChair() {
       Furniture chair = FurnitureFactory.createFurniture("chair");
       assertNotNull(chair);
       assertTrue(chair instanceof Chair);
       assertDoesNotThrow(chair::production);
    }
    @Test
    void createFurnitureSofa() {
        Furniture sofa = FurnitureFactory.createFurniture("sofa");
        assertNotNull(sofa);
        assertTrue(sofa instanceof Sofa);
        assertDoesNotThrow(sofa::production);
    }

    @Test
    void createFurnitureTable() {
        Furniture table = FurnitureFactory.createFurniture("table");
        assertNotNull(table);
        assertTrue(table instanceof Table);
        assertDoesNotThrow(table::production);
    }
    @Test
    public void testCreateUnsupportedFurniture() {
        assertThrows(IllegalArgumentException.class, () -> {
             FurnitureFactory.createFurniture("closet");

        });
    }

}

