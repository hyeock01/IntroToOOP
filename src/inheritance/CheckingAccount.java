package inheritance;

public class CheckingAccount extends BankAccount{
    private long limit;

    public CheckingAccount(String name, double balance, String accountnum, long limit) {
        super(name, balance, accountnum);
        this.limit = limit;
    }

    public long getLimit() {
        return limit;
    }

    public void setLimit(long limit) {
        this.limit = limit;
    }

    @Override
    public double getBalance() {
        System.out.println("채킹이엥용");
        return super.getBalance();
    }
}
