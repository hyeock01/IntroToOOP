package inheritance;

public class SavingAccount extends BankAccount {
    private int transactions;

    public SavingAccount(String name, String accountnum, int transactions) {
        super(name, accountnum);
        this.transactions = transactions;
    }

    public int getTransactions() {
        return transactions;
    }

    public void setTransactions(int transactions) {
        this.transactions = transactions;
    }
}
