import java.util.ArrayList;

public class Bank {
    ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(double defaultBalance,int type){

        Account a=null;

        switch (type){
            case 1:
                 a = new PenguinAccount(defaultBalance);
                break;
            case 2:
                a = new VIPAccount(defaultBalance);
                break;
            case 3:
                a = new CreditAccount(defaultBalance);
                break;
        }
        accounts.add(a);
    }
    /*public void withDrawFromAccount(Account a, double amount){
        a.withDraw(amount);
    }
    */

}
