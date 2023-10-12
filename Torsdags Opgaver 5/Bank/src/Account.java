public class Account {
    protected double balance;
    private int ID;
    private String name;

    public Account(double defaultBalance){
        this.balance=defaultBalance;
    }

    public boolean withDraw(double amount){
        this.balance-=amount;
        return true;
    }
    public void deposit(double amount){
        this.balance+=amount;
    }


    //Getters
    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }
}
