public class DieselCar extends AFuelCar{
    boolean hasParticlefilter;
    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, boolean hasParticleFilter, String fuelType, int kMl) {
        super(registrationNumber, make, model, numberOfDoors,fuelType, kMl);
        this.hasParticlefilter=hasParticleFilter;
    }

    @Override
    String getFuelType() {
        return this.fuelType;
    }

    @Override
    public int getRegistrationFee() {
        if(this.kML<50 && this.kML>20){
            return 130;
        } else if (this.kML<20 && this.kML>15) {
            return 1390;
        } else if (this.kML<15 && this.kML>10) {
            return 1850;
        } else if (this.kML<10 && this.kML>5) {
            return 2770;
        } else if (this.kML<5) {
            return 15260;
        }
        return 130;
    }

    public boolean hasParticleFilter(){
        return this.hasParticlefilter;
    }

}
