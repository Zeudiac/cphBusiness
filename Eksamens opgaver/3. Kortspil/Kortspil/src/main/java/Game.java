import java.util.Random;

import static java.lang.Math.random;

public class Game {
    Random rand = new Random();
    Deck d = new Deck();

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
}
