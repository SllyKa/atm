package ru.bank.atm.server;

import java.util.Objects;

public class Client {

    private Account account;

    public Client(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(account, client.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(account);
    }
}
