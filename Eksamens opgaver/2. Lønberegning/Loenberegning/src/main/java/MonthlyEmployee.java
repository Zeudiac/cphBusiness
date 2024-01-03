public class MonthlyEmployee extends Employee{
    private double salary;

    public MonthlyEmployee(double salary){
        this.salary=salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
