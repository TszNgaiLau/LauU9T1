public class VehicleRunner {
    public static void main(String[] args) {
        // testing all available methods on a Vehicle object
        Vehicle myVehicle = new Vehicle("Generic Vehicle", 6);
        System.out.println(myVehicle.getName());
        System.out.println(myVehicle.getWheels());
        myVehicle.move(10);
        myVehicle.turn();
        myVehicle.brake();

        // testing all available methods on a Car object
        Car myCar = new Car("Honda Civic", 4, "leather");
        System.out.println(myCar.getName()); // inherited method
        System.out.println(myCar.getWheels()); // inherited method
        System.out.println(myCar.getFabric()); // method ONLY available on Car objects
        myCar.move(30); // inherited method
        myCar.turn(); // inherited method
        myCar.brake(); // inherited method
        myCar.honk(); // method ONLY available on Car objects
        myCar.lockDoors(); // method ONLY available on Car objects

        // ---- WRITE YOUR BICYCLE TEST CODE BELOW ----
        Bicycles myBicycle = new Bicycles("Ford", 4, 13);
        myBicycle.ringBell();
        myBicycle.brake();
        myBicycle.move(60);
        myBicycle.turn();
        System.out.println(myBicycle.getName());
        System.out.println(myBicycle.getWheels());
        System.out.println(myBicycle.gearCount());

        Train myTrain = new Train("Steam", 12, 3);
        System.out.println(myTrain.getCarts());
        System.out.println(myTrain.getName());
        System.out.println(myTrain.getWheels());
        myTrain.whistle();
        myTrain.brake();
        myTrain.move(40);
        myTrain.turn();
    }
}