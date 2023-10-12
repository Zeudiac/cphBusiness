public class CreditAccount extends Account{
    private double maxAmount = 5000;

    public CreditAccount(double defaultBalance){
        super(defaultBalance);

    }
    @Override
    public boolean withDraw(double amount){
        if(amount<=maxAmount) {
            super.withDraw(amount);
            return true;
        }
        return false;
    }

    public void setMax(double amount){
        this.maxAmount=amount;
    }
}
