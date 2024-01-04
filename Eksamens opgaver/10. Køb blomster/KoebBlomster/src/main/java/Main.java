import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FlowerShop fS = new FlowerShop();
        Scanner scan = new Scanner(System.in);
        fS.runDialog();

        while(true){
            System.out.println("Indtast Q for at afslutte køb - tryk enter for at købe tre yderligere blomster");
            if(scan.nextLine().equalsIgnoreCase("q")){
                break;
            }
            fS.runDialog();
        }
    }
}