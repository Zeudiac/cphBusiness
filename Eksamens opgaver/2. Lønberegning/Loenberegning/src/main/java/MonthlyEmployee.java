public class MonthlyEmployee extends Employee{
    private double salary;
    private int bonus;

    public MonthlyEmployee(double salary){
        this.salary=salary;
    }

    @Override
    public double calculateSalary() {
        bonus+=3;
        return super.calculateSalary();
    }
}
