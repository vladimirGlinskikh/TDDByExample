package kz.zhelezyaka.testDriven;

public class Sum implements Expression {
    public Expression augmend;
    public Expression addmend;

    public Sum(Expression augmend, Expression addmend) {
        this.augmend = augmend;
        this.addmend = addmend;
    }

    @Override
    public Money reduce(Bank bank, String to) {
        int amount = augmend
                .reduce(bank, to).amount + addmend
                .reduce(bank, to).amount;
        return new Money(amount, to);
    }

    @Override
    public Expression plus(Expression addend) {
        return new Sum(this, addmend);
    }

    public Expression times(int i) {
        return new Sum(augmend.times(i), addmend.times(i));
    }
}
