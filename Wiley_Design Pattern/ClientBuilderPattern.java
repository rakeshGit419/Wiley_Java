interface Builder{
    void reset();
    void setSeats(int number);
    void setEngine(Engine engine);
    void setTripComputer(String tripComputer);
    void setGps(String gps);
}

class Engine{
    String type;
    public Engine() {
    }
    public Engine(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "Engine [type=" + type + "]";
    }
    
    
}

class Car {
    private int seats;
    private Engine engine;
    private String tripComputer;
    private String gps;
    
    public void setSeats(int seats) {
        this.seats = seats;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public void setTripComputer(String tripComputer) {
        this.tripComputer = tripComputer;
    }
    public void setGps(String gps) {
        this.gps = gps;
    }
    @Override
    public String toString() {
        return "Car [engine=" + engine + ", gps=" + gps + ", seats=" + seats + ", tripComputer=" + tripComputer + "]";
    }  
      
}

class CarBuilder implements Builder{
    private Car car;
    @Override
    public void reset() {this.car = new Car();}

    @Override
    public void setSeats(int number) {
        this.car.setSeats(number);
    }

    @Override
    public void setEngine(Engine engine) {
        this.car.setEngine(engine);
    }

    @Override
    public void setTripComputer(String tripComputer) {
        this.car.setTripComputer(tripComputer);
    }

    @Override
    public void setGps(String gps) {
        this.car.setGps(gps);
    }

    public Car getResult() {
        return this.car;
    }

}


class Director{

    private CarBuilder carBuilder;
    Engine engine = new Engine("Twin-Turbo");
    
    public Director(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public void makeSportsCar(CarBuilder carBuilder) {
        carBuilder.setEngine(this.engine);
        carBuilder.setSeats(4);
        carBuilder.setTripComputer("");
    }
    
}




public class ClientBuilderPattern {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.makeSportsCar(builder);
        Car car = builder.getResult();
    }
}
