import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Card> userCards = new ArrayList();
        ArrayList<Card> pcCards = new ArrayList();
        int userPoint=0;
        int pcPoint=0;
        int count=1;
        int cardsToDraw=2;

        Game game = new Game();

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to higher, where the goal is to pick the highest card\nDo you wish to play? (Yes or No)");

        if (scan.nextLine().equalsIgnoreCase("Yes")){
            //Add drawn card to pc and user arraylists
            for(int i = 0; i<cardsToDraw; i++) {
                userCards.add(game.drawCard());
                pcCards.add(game.drawCard());
            }
            //add points for user or pc
            for (int z = 0; z<cardsToDraw; z++){
                if(game.highest(userCards.get(z),pcCards.get(z))){
                    userPoint++;
                }
                else{
                    pcPoint++;
                }
            }
            //Show drawn cards
            System.out.println();
            System.out.println("You drew: ");
            for(Card c: userCards){
                System.out.println(count+". "+c.toString());
                count++;
            }
            System.out.println();
            System.out.println("PC drew: ");
            count=1;
            for(Card c: pcCards){
                System.out.println(count+". "+c.toString());
                count++;
            }
            //show points granted
            System.out.println();
            System.out.println("Your points: "+userPoint);
            System.out.println("PC points: "+pcPoint);
            System.out.println();
            if(userPoint>pcPoint){
                System.out.println("YOU WIN!!!!");
            }
            else if(userPoint==pcPoint){
                System.out.println("Draw!");
            }
            else{
                System.out.println("You lost :(((");
            }
        }

    }
}