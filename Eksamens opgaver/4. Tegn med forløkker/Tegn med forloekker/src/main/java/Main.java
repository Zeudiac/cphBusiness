import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int inputNr;
        String inputChar;

        Scanner scan = new Scanner(System.in);

        System.out.println("Choose triangle (L or R):");
        inputChar = scan.nextLine();
        System.out.println("Please choose triangle size(numbers only):");
        inputNr = scan.nextInt();

        if(inputChar.equalsIgnoreCase("L")){
            drawLeftTriangle(inputNr);
        }
        else {
            drawRightTriangle(inputNr);
        }
    }
    public static void drawLeftTriangle(int i) {
        for (int a = 0; a < i+1; a++) {

            for (int b = 0; b < a; b++) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println();
    }

    public static void drawRightTriangle(int i){
        for(int a = 0; a<=i; a++) {
            for (int b = i-a; b>0; b--){
                System.out.print(" ");
            }
            for(int b = 1; b <=a;b++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
