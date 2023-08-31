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
        assertEquals(Money.dollar(5), Money.dollar(5));
        assertEquals(Money.dollar(7), Money.dollar(7));
    }

    @Test
    void testNotEqualityDollar() {
        assertNotEquals(Money.dollar(5), Money.dollar(7));
        assertNotEquals(Money.dollar(4), Money.dollar(9));
    }

    @Test
    void testMultiplicationFranc() {
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }

    @Test
    void testEqualityFranc() {
        assertEquals(Money.franc(5), Money.franc(5));
        assertEquals(Money.franc(7), Money.franc(7));
    }

    @Test
    void testNotEqualityFranc() {
        assertNotEquals(Money.franc(5), Money.franc(7));
        assertNotEquals(Money.franc(4), Money.franc(9));
    }

    @Test
    void dollarIsNotEqualFranc() {
        assertNotEquals(Money.dollar(5), Money.franc(5));
    }

    @Test
    void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("FRK", Money.franc(1).currency());
    }
}
