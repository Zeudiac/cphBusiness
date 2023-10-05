import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    ArrayList<String> coffeeMenu = new ArrayList<>();

    Cafe(){

    }

    public void loadMenuData(){
        File coffeefile = new File("src/coffee");

        try {
            Scanner menuScanner = new Scanner(coffeefile);
            while(menuScanner.hasNextLine()){

                coffeeMenu.add(menuScanner.nextLine());
            }
        }
        catch (FileNotFoundException e){
            System.out.println("404 file not found");
        }
    }
}
