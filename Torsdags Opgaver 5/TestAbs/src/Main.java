public class Main {
    public static void main(String[] args) {
        KnockoutTournament kt = new KnockoutTournament();
        Tournament t = new Tournament("Maltes Cup");
        t.onEndGame();
        kt.onEndGame();


    }
}