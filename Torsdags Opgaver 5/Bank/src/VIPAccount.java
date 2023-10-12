public class VIPAccount extends Account{

    public VIPAccount(double defaultBalance){
        super(defaultBalance);
    }

    @Override
    public void deposit(double amount){
        double interest = amount*0.1;
        this.balance+=amount+interest;
    }

}
