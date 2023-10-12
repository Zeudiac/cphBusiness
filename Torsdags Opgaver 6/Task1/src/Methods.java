import java.util.Scanner;

public class Methods {
    public static void methodA(int input) {
        if (input % 2 == 0) {
            System.out.println("S");
        }
        else{
            System.out.println("K");
        }
    }

    public static void methodB(){
        System.out.println("U");
    }

    public static void methodC(int input){
        methodA(input);
        System.out.println("Y");
    }

    public static void methodD(){
        Scanner s = new Scanner(System.in);
        methodA(s.nextInt());
    }
}
