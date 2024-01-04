public abstract class Employee{
    double salary;
    int id=1;
    static int count;

    public double calculateSalary(){
        return salary;
    }
    public Employee(){
        count++;
        id=count;
    }
}
