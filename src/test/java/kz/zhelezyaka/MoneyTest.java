package kz.zhelezyaka;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {
    @Test
    void testMultiplicationDollar() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(new Dollar(10), product);
        product = five.times(3);
        assertEquals(new Dollar(15), product);
    }

    @Test
    void testEqualityDollar() {
        assertEquals(new Dollar(5), new Dollar(5));
        assertEquals(new Dollar(7), new Dollar(7));
    }

    @Test
    void testNotEqualityDollar() {
        assertNotEquals(new Dollar(5), new Dollar(7));
        assertNotEquals(new Dollar(4), new Dollar(9));
    }

    @Test
    void testMultiplicationFranc() {
        Franc five = new Franc(5);
        Franc product = five.times(2);
        assertEquals(new Franc(10), product);
        product = five.times(3);
        assertEquals(new Franc(15), product);
    }

    @Test
    void testEqualityFranc() {
        assertEquals(new Franc(5), new Franc(5));
        assertEquals(new Franc(7), new Franc(7));
    }

    @Test
    void testNotEqualityFranc() {
        assertNotEquals(new Franc(5), new Franc(7));
        assertNotEquals(new Franc(4), new Franc(9));
    }

    @Test
    void dollarIsNotEqualFranc() {
        assertNotEquals(new Dollar(5), new Franc(5));
    }
}
