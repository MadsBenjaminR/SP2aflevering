public class DieselCar extends AFuelCar {

    private boolean particleFilter;

    public DieselCar(int kmPrLitre, boolean particlefilter, String registrationNumber, String make, String model, int numberOfDoors){
        super(kmPrLitre, registrationNumber, make, model, numberOfDoors);
        this.particleFilter = particlefilter;

    }

    public String getFuelType(){
        return "Diesel car";
    }

    public boolean hasParticleFilter(){
        return this.particleFilter;
    }

    public int getRegistrationFee(){
        int fee = 0;
        int nFilterFee = 1000;

        if(hasParticleFilter() == true) {
            if (getKmPrLitre() > 20 && getKmPrLitre() <= 50) {
                fee = 330 + 130;
                return fee;
            } else if (getKmPrLitre() > 15 && getKmPrLitre() <= 20) {
                fee = 1050 + 1390;
                return fee;
            } else if (getKmPrLitre() > 10 && getKmPrLitre() <= 15) {
                fee = 2340 + 1850;
                return fee;
            } else if (getKmPrLitre() > 5 && getKmPrLitre() <= 10) {
                fee = 5500 + 2770;
                return fee;
            }
            if (getKmPrLitre()<= 5) {
                fee = 10470 + 15260;
                return fee;
            }
            return fee;

        } else {
            if (getKmPrLitre() > 20 && getKmPrLitre() <= 50) {
                fee = 330 + 130 + nFilterFee;
                return fee;
            } else if (getKmPrLitre() > 15 && getKmPrLitre() <= 20) {
                fee = 1050 + 1390 + nFilterFee;
                return fee;
            } else if (getKmPrLitre() > 10 && getKmPrLitre() <= 15) {
                fee = 2340 + 1850 + nFilterFee;
                return fee;
            } else if (getKmPrLitre() > 5 && getKmPrLitre() <= 10) {
                fee = 5500 + 2770 + nFilterFee;
                return fee;
            }
            if (getKmPrLitre() <= 5) {
                fee = 10470 + 15260 + nFilterFee;
                return fee;
            }
            return fee;

        }

    }

    @Override
    public String toString(){
        return super.toString()
                + "\n particle filter included: " + particleFilter;
    }
}