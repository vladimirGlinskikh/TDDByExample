package kz.zhelezyaka;

public interface Expression {
    default Money reduce(Bank bank, String to) {
        return null;
    }
}
