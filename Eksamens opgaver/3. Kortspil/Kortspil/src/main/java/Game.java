import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

public class Game {
    private Random rand = new Random();
    Deck d = new Deck();
    private ArrayList<Card> userCards = new ArrayList();
    private ArrayList<Card> pcCards = new ArrayList();
    private int userPoint=0;
    private int pcPoint=0;
    private int count=1;
    private int cardsToDraw;

    String doYouWantToPlay="Welcome to higher, where the goal is to pick the highest card\nDo you wish to play? (Yes or No)";

    Scanner scan = new Scanner(System.in);

    public Card drawCard(){
        //Returning random card from Arraylist(theDeck) in the range 0-51
        return d.getTheDeck().get(rand.nextInt(52));
    }
    public boolean highest(Card c1,Card c2){
        if(c1.getRank()>c2.getRank()){
            return true;
        }
        else if(c1.getRank()<c2.getRank()){
            return false;
        }
        else if(c1.getRank()==c2.getRank()){
            if(c1.getSuit()>c2.getSuit()){
                return true;
            }
            else{
                return false;
            }
        }
        System.out.println("Error");
        return true;
    }

    public void startGame(){


        if (scan.nextLine().equalsIgnoreCase("Yes")){
            System.out.print("How many cards would you like to play?: ");
            cardsToDraw=scan.nextInt();
            //Add drawn card to pc and user arraylists
            for(int i = 0; i<cardsToDraw; i++) {
                userCards.add(drawCard());
                pcCards.add(drawCard());
            }
            //add points for user or pc
            for (int z = 0; z<cardsToDraw; z++){
                if(highest(userCards.get(z),pcCards.get(z))){
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
                System.out.println(count+". "+c);
                count++;
            }
            System.out.println();
            System.out.println("PC drew: ");
            count=1;
            for(Card c: pcCards){
                System.out.println(count+". "+c);
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
        doYouWantToPlay="Do you want to play again?";
        startGame();
    }
}
