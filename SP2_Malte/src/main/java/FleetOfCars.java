import java.util.ArrayList;

public class FleetOfCars{
    ArrayList<Car> cars = new ArrayList<>();

    public void addCar(Car c){
        cars.add(c);
    }

    @Override
    public String toString() {
        String fleat="";
        for (Car c: cars) {
            fleat += c.toString()+"\n";
        }
        return fleat;
    }

    public int getTotalRegistrationFeeForFleet(){
        int totalRegFee=0;
        for (Car c: cars) {
            totalRegFee+=c.getRegistrationFee();
        }
        return totalRegFee;
    }
}
