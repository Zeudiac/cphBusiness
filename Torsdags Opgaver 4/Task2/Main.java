import java.util.Scanner;

class Main{
	public static void main(String[] args){
		//Creating scanner
		Scanner scanner = new Scanner(System.in);

		//Asking for user input
		System.out.print("Pleas type your name: ");

		// Receiving users name
		String scanName = scanner.nextLine();

		// Printing user greeting + asking for user age
		System.out.print("Hi "+scanName+", Please type your age: ");

		//Receiving users age
		int scanAge = scanner.nextInt();

		System.out.println(scanAge);

		int retireAge =67-scanAge;

		System.out.print("Years until retire age: "+retireAge);
	}

}