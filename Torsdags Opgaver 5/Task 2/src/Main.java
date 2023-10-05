public class Main {
    public static void main(String[] args) {
        Cafe c1 = new Cafe();
        c1.loadMenuData();

        for(String c: c1.coffeeMenu){
            System.out.println(c);
        }
    }
}