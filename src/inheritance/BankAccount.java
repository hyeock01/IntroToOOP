package inheritance;

import java.util.Objects;

public class BankAccount {
    private String name;
    private double balance;
    private String accountnum;

    public BankAccount(String name, double balance, String accountnum) {
        this.name = name;
        this.balance = balance;
        this.accountnum = accountnum;
    }

    public BankAccount(String name, String accountnum) {
        this.name = name;
        this.balance = 0.0;
        this.accountnum = accountnum;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountnum() {
        return accountnum;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountnum(String accountnum) {
        this.accountnum = accountnum;
    }

    @Override
    public String toString() {
        return this.accountnum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Objects.equals(accountnum, that.accountnum);
    }

}


