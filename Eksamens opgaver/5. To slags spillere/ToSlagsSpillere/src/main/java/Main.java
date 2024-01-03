import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();

        int maxValue = 2;
        int numberToGuess;

        int hPGuess;
        int cPGuess;

        numberToGuess = rand.nextInt(maxValue);

        HumanPlayer hP = new HumanPlayer();
        ComputerPlayer cP = new ComputerPlayer();

        hPGuess = hP.makeAGuess(maxValue);
        cPGuess = cP.makeAGuess(maxValue);

        if(hPGuess==numberToGuess){
            System.out.println("The Human Player guessed the number!");
        }
        if(cPGuess==numberToGuess){
            System.out.println("The Cumputer guessed the number!");
        }
        else if(cPGuess!=numberToGuess && hPGuess!=numberToGuess){
            System.out.println("No one guessed the number...");
        }

    }
}