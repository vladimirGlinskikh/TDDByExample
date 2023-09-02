package kz.zhelezyaka;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {
    @Test
    void testMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));

        Money fiveFrank = Money.franc(5);
        assertEquals(Money.franc(10), fiveFrank.times(2));
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

    @Test
    void testSimpleAddition() {
        Money five = Money.dollar(5);
        Expression sum = five.plus(five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(10), reduced);
    }

    @Test
    void testPlusReturnsSum() {
        Money five = Money.dollar(5);
        Expression result = five.plus(five);
        Sum sum = (Sum) result;
        assertEquals(five, sum.augmend);
        assertEquals(five, sum.addmend);
    }

    @Test
    void testReduceSum() {
        Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
        Bank bank = new Bank();
        Money result = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(7), result);
    }

    @Test
    void testReduceMoney() {
        Bank bank = new Bank();
        Money result = bank.reduce(Money.dollar(1), "USD");
        assertEquals(Money.dollar(1), result);
    }

    @Test
    void testReduceMoneyDifferentCurrency() {
        Bank bank = new Bank();
        bank.addRate("FRK", "USD", 2);
        Money result = bank.reduce(Money.franc(2), "USD");
        assertEquals(Money.dollar(1), result);
    }

    @Test
    void testIdentityRate() {
        assertEquals(1, new Bank().rate("USD", "USD"));
        assertEquals(1, new Bank().rate("FRK", "FRK"));
    }
}
