public class CommissionEmployee extends Employee {
    private double baseSalary;
    private double sale;
    private double commissionPercentage;

    CommissionEmployee(double baseSalary, double sale, double commissionPercentage){
        super();
        this.baseSalary=baseSalary;
        this.sale=sale;
        this.commissionPercentage=commissionPercentage;
    }

    @Override
    public double calculateSalary() {
        return baseSalary+(sale*commissionPercentage/100);
    }
}
