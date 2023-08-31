package kz.zhelezyaka;

public class Dollar extends Money {

    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int i) {
        return Money.dollar(amount * i);
    }
}
