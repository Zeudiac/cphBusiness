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
        flower1 = chooseFlower();

        //2nd flower
        flower2 = chooseFlower();

        //3rd flower
        flower3 = chooseFlower();

        //Asking user if the flowers are correct
        System.out.println("\nYou Choose the following flowers:\n"+flowers.get(flower1-1)+"\n"+flowers.get(flower2-1)+"\n"+flowers.get(flower3-1));
        System.out.print("Is this correct? (y/n): ");
        correctFlowers = scan.next().toLowerCase().charAt(0);
        if(correctFlowers!='y'){
            System.out.println("Please make sure to pick the correct flowers: ");
            total=0;
            runDialog();
        }
        //bouquet?
        System.out.print("Do you wish for your flowers to be bound in a bouquet? (y/n): ");
        bouquet = scan.next().toLowerCase().charAt(0);
        if(bouquet=='y'){
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

    public int chooseFlower() {
        int flower=0;
        while(flower>10||flower<1) {
            System.out.println("Pick a flower by entering the flowers given number, if a flower is correctly entered - it will be shown: ");
            String input = scan.nextLine();
            try {
                flower = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Please select a valid number..");
            }
        }
        addFlowerPrice(flower);
        System.out.println("Chosen flower: " + flowers.get(flower - 1));
        return flower;
    }
}