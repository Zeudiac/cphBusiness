import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Employee> employees = new ArrayList<>();

        MonthlyEmployee mE = new MonthlyEmployee(32474.5);
        HourlyEmployee hE = new HourlyEmployee(82.75,140);
        CommissionEmployee cE = new CommissionEmployee(18759.99,28655.78,0.20);

        employees.add(mE);
        employees.add(hE);
        employees.add(cE);

        for (Employee e: employees){
            System.out.println(e.calculateSalary());
        }
        //Hvis du har mere tid: Tilføj relevante attributter og ikke-abstrakte metoder til Employee fx name, adress, department og lignende. Lav justeringer i subklasserne, hvis det er nødvendigt. Test i main, at metoderne virker for dine tre subklasser.
    }
    
}