public class Flows {

    public void methodA(String input) {
        System.out.println("j");
        if (!input.equals("start")) {
            System.out.println("b");
            methodB("start");
        } else {
            System.out.println("a");
            System.out.println(methodC(input));

        }
        System.out.println("s");
    }

    public void methodB(String start) {
        System.out.println("j");
        if (start.equals("Hello, world")){
            System.out.println("o");
        }
    }

    public String methodC(String input) {
        System.out.println("v");
        methodD(input.length());
        return "r";
    }

    public void methodD(int number) {
        if (number == 5) {
            System.out.println("a");
            System.out.println("e");
        }
        else if(number==25){
            System.out.println("t");
        }

    }


}