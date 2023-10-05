import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Costumer c1 = new Costumer("Malte", "Olesen", "Zeudiac");
        Costumer c2 = new Costumer("Alfred", "Fernandez", "Ferne");
        System.out.println(c1);
        ArrayList<Costumer> costumers = new ArrayList<>();
        costumers.add(c1);
        costumers.add(c2);
        printCustomers(costumers);
    }
    static void printCustomers(ArrayList<Costumer> costumers){
        for (Costumer c: costumers){
            System.out.println(c);
        }
    }
}