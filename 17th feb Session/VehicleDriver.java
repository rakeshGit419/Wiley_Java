abstract class Vehicle{
    abstract void drive();
    abstract void steeringMechanism();

    void start(){
        System.out.println("Vehicle Started");
    }

    void stop(){
        System.out.println("Vehicle Stoped");
    }
}

class Bike extends Vehicle{

    @Override
    void drive() {
        System.out.println("Drive func from Bike Class");
    }

    @Override
    void steeringMechanism() {
        System.out.println("steeringMechanism func from Bike Class");
    }

}

class Car extends Vehicle{

    @Override
    void drive() {
        System.out.println("Drive func from Car Class");
    }

    @Override
    void steeringMechanism() {
        System.out.println("steeringMechanism func from Car Class");
    }

}

public class VehicleDriver{
    public static void main(String[] args) {
        
        Bike bike = new Bike();
        bike.start();
        bike.drive();
        bike.steeringMechanism();
        bike.stop();

        System.out.println();

        Car car = new Car();
        car.start();
        car.drive();
        car.steeringMechanism();
        car.stop();

    }
}