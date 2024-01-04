public class HourlyEmployee extends Employee{
    private int bonus=100;
    private double numberOfHours;
    private int payPerHour;
    public HourlyEmployee(double numberOfHours, int payPerHour){
        this.numberOfHours=numberOfHours;
        this.payPerHour=payPerHour;
    }

    @Override
    public double calculateSalary() {
        try{

        }catch (NumberFormatException e){

        }

        if(numberOfHours>80){
            return (numberOfHours*payPerHour)+bonus;
        }
        return numberOfHours*payPerHour;
    }
}
