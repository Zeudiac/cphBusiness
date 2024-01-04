import java.util.ArrayList;
import java.util.Random;

public class Main {
    static ArrayList <Employee> employees = new ArrayList<>();
    public static void main(String[] args) {


        Employee mE = new MonthlyEmployee(32474.5);
        Employee hE = new HourlyEmployee(82.75,140);
        Employee cE = new CommissionEmployee(18759.99,28655.78,20);

        employees.add(mE);
        employees.add(hE);
        employees.add(cE);

        displaySalaryAllEmployees();
        //Hvis du har mere tid: Tilføj relevante attributter og ikke-abstrakte metoder til Employee fx name, adress, department og lignende. Lav justeringer i subklasserne, hvis det er nødvendigt. Test i main, at metoderne virker for dine tre subklasser.
    }
    public static void displaySalaryAllEmployees(){
        for (Employee e: employees){
            System.out.println(e.calculateSalary());
        }
    }
    
}