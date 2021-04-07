package com.company;

public class BankAccount {

    private double amount;

    public double getAmount() {
        return amount;
    }

    public double deposit(double sum) {
        return amount += sum;
    }

    public double withdraw(int sum) throws LimitException {
        if (amount < sum) {
            throw new LimitException("У вас недостаточно денег на счету.\nСчитано с карты: " + amount, amount);
        }
        return this.amount -= sum;
    }
}
