package kz.zhelezyaka;

import java.util.Objects;

public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int i) {
        return new Dollar(amount * i);
    }
}
