package kz.zhelezyaka;

import java.util.Objects;

public class Franc extends Money {
    public Franc(int amount) {
        this.amount = amount;
    }
    public Money times(int i) {
        return new Franc(amount * i);
    }
}
