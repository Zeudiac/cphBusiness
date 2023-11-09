public abstract class AFuelCar extends ACar{
    int kML;
    String fuelType;
    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, String fuelType, int kML) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kML = kML;
        this.fuelType=fuelType;

    }

    String getFuelType(){
        return this.fuelType;
    }
    int getkmPrLitre(){
        return this.kML;
    }

    @Override
    public String toString() {
        return super.toString()+"\nKm/L:   "+this.kML;
    }
}
