package kz.zhelezyaka;

public class Franc extends Money {
    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int i) {
        return Money.franc(amount * i);
    }
}
