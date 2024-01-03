import java.util.Random;

public class ComputerPlayer implements Player{
    @Override
    public int makeAGuess(int value) {
        Random rand = new Random();
        return rand.nextInt(value+1);
    }
}
