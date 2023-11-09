import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        FleetOfCars f = new FleetOfCars();

        GasolineCar gC = new GasolineCar("CG80291","Peugeot","207",3,"Gasoline",14);
        DieselCar dC = new DieselCar("BX87355","VW","Golf",5,false,"Diesel",19);
        ElectricCar eC = new ElectricCar("QZ92593","Tesla","X",5,500,1000);

        f.addCar(gC);
        f.addCar(dC);
        f.addCar(eC);

        System.out.println(gC.getRegistrationFee());
        System.out.println(dC.getRegistrationFee());
        System.out.println(eC.getRegistrationFee());

        System.out.println("\nTotal Registration fee for fleet: "+f.getTotalRegistrationFeeForFleet());

        System.out.println(f.toString());
    }
}
