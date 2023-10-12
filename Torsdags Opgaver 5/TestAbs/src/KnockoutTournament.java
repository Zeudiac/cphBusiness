public class KnockoutTournament extends Tournament{
    public KnockoutTournament(String name){
        super(name);
    }
    @Override
    public void onEndGame(){
        super.onEndGame();
        System.out.println("remove the user");
    }
}
