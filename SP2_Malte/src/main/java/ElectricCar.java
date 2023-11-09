public class ElectricCar extends ACar{
    private int batteryCapacity;
    private int maxRangeKM;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRangeKm) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity=batteryCapacity;
        this.maxRangeKM=maxRangeKm;
    }

    @Override
    public int getRegistrationFee() {
        int whPrKm = whPrKm();
        double kML=100/(whPrKm/91.25);

        if(kML<50 && kML>20){
            return 330;
        } else if (kML<20 && kML>15) {
            return 1050;
        } else if (kML<15 && kML>10) {
            return 2340;
        } else if (kML<10 && kML>5) {
            return 5500;
        } else if (kML<5) {
            return 10470;
        }
        return 330;
    }
    public int getBatteryCapacity(){
        return this.batteryCapacity;
    }
    public int getMaxRangeKM(){
        return this.maxRangeKM;
    }
    public int whPrKm(){
        return maxRangeKM/batteryCapacity;
    }
}
