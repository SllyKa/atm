package ru.bank.atm.client;

import ru.bank.atm.server.Bank;

import java.util.Objects;

public class ATM {

    private Bank bank;

    public ATM(Bank bank) {
        this.bank = bank;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ATM atm = (ATM) o;
        return Objects.equals(bank, atm.bank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bank);
    }
}
