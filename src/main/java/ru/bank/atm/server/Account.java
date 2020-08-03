package ru.bank.atm.server;

import java.util.Objects;

public class Account {

    private long balance;
    private Currency currency;

    public Account(long balance, Currency currency) {
        this.balance = balance;
        this.currency = currency;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return balance == account.balance &&
                currency == account.currency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(balance, currency);
    }
}
