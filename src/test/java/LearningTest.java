/**
 * Name: Isaiah Artiaga
 * Date: 09/05/2025
 * Tests if x and y pass on addition and subtraction.
 */
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LearningTest {

    Learning addition;
    Learning subtraction;
    int x = 6;
    int y = 7;

    @BeforeEach
    void setUp() {
        addition = new Learning(x, y, "add");
        subtraction = new Learning(x, y, "subtraction");

    }

    @AfterEach
    void tearDown() {
        addition = null;
        subtraction = null;
    }

    @Test
    void operate() {
        assertEquals(x+y, addition.operate(x, y));
    }

    @Test
    void getX() {
        assertEquals(x, addition.getX());
        assertEquals(x, subtraction.getX());
    }

    @Test
    void setX() {
        assertEquals(x, addition.getX());
        addition.setX(10);
        assertNotEquals(x, addition.getX());
        assertEquals(10, addition.getX());
        assertNotEquals(addition.getX(), subtraction.getX());
    }
}