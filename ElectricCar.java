public class ElectricCar extends ACar {

    public int batteryCapacity;

    public int maxRangeKm;

    public ElectricCar(int batteryCapacity, int maxRangeKm, String registrationNumber, String make, String model, int numberOfDoors) {
        super(registrationNumber,make,model,numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRangeKm = maxRangeKm;

    }

    public int getBatteryCapacityKWH() {
        return batteryCapacity;
    }

    public int getMaxRangeKm() {
        return maxRangeKm;
    }

    public int getWhPrKm() {

        return batteryCapacity * 1000 / maxRangeKm;
    }

    // km/l = (energiindhold pr. liter i kWh) / (Wh/km)

    public int getRegistrationFee() {
        int fee = 0;
        //For en Elbil gælder de samme regler som for en benzinbil, blot skal man først omregne watt-timer pr kilometer til km/l.
        // Det gøres ved at dividere Wh/km med 91,25 ogdernæst dividere 100 med dette tal. Se evt. formlen her:
        //https://fdm.dk/alt-om-biler/dine-rettigheder/boder-afgifter/ejerafgift-elbil
        int kmPrLitre = (int) Math.floor(100 / (getWhPrKm() / 91.25));

        if (kmPrLitre <= 4) {
            fee = 10470;
        }
        // mellem 5 km/l og 10 km/l er prisen 5500kr,
        if (kmPrLitre >= 5 && kmPrLitre <= 9) {
            fee = 5500;
        }
        // mellem 10 km/l og 15 km/l er prisen 2340 kr,
        if (kmPrLitre >= 10 && kmPrLitre <= 14) {
            fee = 2340;
        }
        // mellem 15 km/l og 20 km/l er prisen 1050 kr,
        if (kmPrLitre >= 15 && kmPrLitre <= 19) {
            fee = 1050;
        }
        // Hvis den kører mellem 20 km/l og 50 km/l er prisen 330 kr,
        if (kmPrLitre >= 20 && kmPrLitre <= 50) {
            fee = 330;
        }

        return fee;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n Battery capacity: " + getBatteryCapacityKWH() + "\n Range: " + getMaxRangeKm()+"km \n";
    }
}