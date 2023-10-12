import java.time.LocalDate;

public class Tournament {
    LocalDate date;
    public String Name;

    public Tournament(String name){

    }
    public void onEndGame(){
        System.out.println("play fanfare");
    }
}
