import java.util.ArrayList;

public class Deck {
     private ArrayList <Card> theDeck = new ArrayList<>();
     public Deck(){
          //Creating a full deck of cards(52) and adding them to the card deck Arraylist (theDeck)
          for(int i=1; i<5; i++){
               for(int e=1; e<14; e++){
                    Card card = new Card(e,i);
                    theDeck.add(card);
               }
          }
     }

     public ArrayList<Card> getTheDeck() {
          return theDeck;
     }
}
