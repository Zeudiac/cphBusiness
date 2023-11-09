public class GasolineCar extends AFuelCar{
    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors,String fuelType, int kML) {
        super(registrationNumber, make, model, numberOfDoors, fuelType,kML);
    }

    @Override
    public String getFuelType() {
        return this.fuelType;
    }

    @Override
    public int getRegistrationFee() {
        if(this.kML<50 && this.kML>20){
            return 330;
        } else if (this.kML<20 && this.kML>15) {
            return 1050;
        } else if (this.kML<15 && this.kML>10) {
            return 2340;
        } else if (this.kML<10 && this.kML>5) {
            return 5500;
        } else if (this.kML<5) {
            return 10470;
        }
        return 330;
    }
}
