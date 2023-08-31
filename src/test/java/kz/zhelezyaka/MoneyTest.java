package kz.zhelezyaka;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {
    @Test
    void testMultiplicationDollar() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
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
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
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
