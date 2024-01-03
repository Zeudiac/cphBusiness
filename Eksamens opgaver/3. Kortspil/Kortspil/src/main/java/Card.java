public class Card {
    private int rank;
    private int suit;

    public  Card(int rank, int suit){
        this.rank=rank;
        this.suit=suit;
    }

    @Override
    public String toString() {
        String suitS="";
        String rankS="";
        switch (suit){
            case 1:
                suitS="Clubs";
                break;
            case 2:
                suitS="Diamonds";
                break;
            case 3:
                suitS="Hearts";
                break;
            case 4:
                suitS="Spades";
                break;
            default:
                suitS=String.valueOf(rank);
        }
        switch (rank){
            case 1:
                rankS="Ace";
                break;
            case 11:
                rankS="Jack";
                break;
            case 12:
                rankS="Queen";
                break;
            case 13:
                rankS="King";
                break;
            default:
                rankS=String.valueOf(rank);
        }
        return rankS+" of "+suitS;
    }

    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }

}
