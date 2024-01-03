import java.util.Scanner;

public class HumanPlayer implements Player {
    @Override
    public int makeAGuess(int value) {
        System.out.println("Make your guess (1 to "+value+"):");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

}
