import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.addAccount(20000,3);//Credit Account
        b.addAccount(20000,1);//Penguin Account
        b.addAccount(20000,2);//VIP Account

        //Test af Penguin Account
        Account kidsaccount = b.accounts.get(1);
        System.out.println("forsøger at gå i minus: "+kidsaccount.withDraw(20000));
        System.out.println(kidsaccount.getBalance());
        System.out.println();

        //Test af Credit Account
        Account creditaccount = b.accounts.get(0);
        boolean result = creditaccount.withDraw(5000);
        System.out.println("Forsøger at trække 5000: "+result);
        boolean result2 = creditaccount.withDraw(5001);
        System.out.println("Forsøger at trække 5001: "+result2);
        System.out.println();
        //Test af setMax
        CreditAccount cd = (CreditAccount) b.accounts.get(0);
        cd.setMax(10000);

        Account vipaccount = b.accounts.get(2);
        vipaccount.deposit(1000);

        System.out.println("Konto efter deposit: "+vipaccount.getBalance());

    }
}