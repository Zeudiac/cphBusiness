public class PenguinAccount extends Account{

    public PenguinAccount(double defaultBalance){
        super(defaultBalance);
    }
@Override
    public boolean withDraw(double amount){
        if (amount<=this.balance){
            super.withDraw(amount);
            return true;
        }
        return false;

}
}
