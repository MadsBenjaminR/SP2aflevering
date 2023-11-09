public class GasolinCar extends AFuelCar{

    public GasolinCar(int kmPrLitre, String registrationNumber, String make, String model, int numberOfDoors){
        super(kmPrLitre, registrationNumber, make,model,numberOfDoors);

    }

    public int getRegistrationFee(){
        int fee = 0;

        if(getKmPrLitre()>20 && getKmPrLitre()<=50) {
            fee = 330;
            return fee;
        }else if(getKmPrLitre()>15 && getKmPrLitre()<=20) {
            fee = 1050;
            return fee;
        }else if(getKmPrLitre()>10 && getKmPrLitre()<=15) {
            fee = 2340;
            return fee;
        }else if(getKmPrLitre()>5 && getKmPrLitre()<=10){
            fee = 5500;
            return fee;
        }else if(getKmPrLitre()<=5){
            fee = 10470;
            return fee;
        }
    return fee;
    }

    public String getFuelType(){
        return "Gas car";
    }

    @Override
    public String toString(){
        return super.toString()
                + "\n" + getFuelType();
    }
}