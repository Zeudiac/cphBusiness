import java.util.ArrayList;
import java.util.Scanner;

public class FlowerShop {
    private ArrayList<String> flowers = new ArrayList<>();
    private double total=0;
    private char bouquet;
    private char correctFlowers;
    int flower1;
    int flower2;
    int flower3;

    Scanner scan = new Scanner(System.in);

    public FlowerShop(){
        flowers.add("Rose");
        flowers.add("Mistletoe");
        flowers.add("Lily");
        flowers.add("Tulip");
        flowers.add("Chrysanthemum");
        flowers.add("Dahlia");
        flowers.add("Sunflower");
        flowers.add("Cornflower");
        flowers.add("Iris");
        flowers.add("Lilac");
    }
    public void displayFlowers(){
        int count=0;
        for(String s: flowers){
            count++;
            System.out.println(count+": "+s);
        }
    }

    public void runDialog(){
        displayFlowers();
        //1st flower
        System.out.println("Please pick three flowers from the list(1-10):");
        flower1 = scan.nextInt();
        addFlowerPrice(flower1);
        System.out.println("1/3: "+flowers.get(flower1-1));
        //2nd flower
        flower2 = scan.nextInt();
        addFlowerPrice(flower2);
        System.out.println("2/3: "+flowers.get(flower2-1));
        //3rd flower
        flower3 = scan.nextInt();
        addFlowerPrice(flower3);
        System.out.println("3/3: "+flowers.get(flower3-1));
        //Asking user if the flowers are correct
        System.out.println("\nYou Choose the following flowers:\n"+flowers.get(flower1-1)+"\n"+flowers.get(flower2-1)+"\n"+flowers.get(flower3-1));
        System.out.print("Is this correct? (y/n): ");
        correctFlowers = scan.next().charAt(0);
        if(correctFlowers!='y'){
            System.out.println("Please make sure to pick the correct flowers: ");
            total=0;
            runDialog();
        }
        //bouquet?
        System.out.print("Do you wish for your flowers to be bound in a bouquet? (y/n): ");
        bouquet = scan.next().charAt(0);
        if(bouquet=='y'||bouquet=='Y'){
            total+=50;
        }
        System.out.println("Your total cost: "+total+",-");
    }
    public void addFlowerPrice(int flower){
        if(flower==5){
            total+=40;
        }
        if(flower<5){
            total+=20;
        }
        else if(flower>4&&flower<8){
            total+=40;
        }
        else{
            total+=80;
        }
    }
}
