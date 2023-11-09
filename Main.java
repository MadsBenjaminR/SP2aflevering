import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        FleetOfCars fleet = new FleetOfCars();

        GasolinCar c1 = new GasolinCar(10,"000001","Audi","R8",3);
        fleet.addCar(c1);
        ElectricCar c2 = new ElectricCar(10,500, "000002", "Opel","Asta",5);
        fleet.addCar(c2);
        DieselCar c3 = new DieselCar(10, true,"000003","Renault","Espase",5);
        fleet.addCar(c3);

        System.out.println("Total registration fee of fleet " + fleet.getTotalRegistrationFeeForFleet()+"kr");
        System.out.println(fleet);
    }
}