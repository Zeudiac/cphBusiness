public class HourlyEmployee extends Employee{
    private double numberOfHours;
    private int payPerHour;
    public HourlyEmployee(double numberOfHours, int payPerHour){
        this.numberOfHours=numberOfHours;
        this.payPerHour=payPerHour;
    }

    @Override
    public double calculateSalary() {
        return numberOfHours*payPerHour;
    }
}
