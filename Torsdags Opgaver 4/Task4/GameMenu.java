import java.util.ArrayList;
import java.util.Scanner;

class GameMenu{	
	private static ArrayList<String> actions;

	public GameMenu(ArrayList<String> actions){
		this.actions=actions;
	}

	public void displayMenu(){
		for(String i: actions){
			System.out.println(i);
		}
}
	public int getAction(){
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Type a number to choose an action");
		displayMenu();

		String input = scanner1.nextLine();
		int choice = Integer.parseInt(input);
		return choice;
	}
}