package design_patterns.creational.bridge_pattern;

abstract class Variant {
    String type;

    Variant(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}

class Modern extends Variant {
    public Modern() {
        super("Modern");
    }
}

class Victorian extends Variant {
    public Victorian() {
        super("Victorian");
    }
}

abstract class Product {
    Variant variant;
    String name;

    Product(Variant variant, String name) {
        this.variant = variant;
        this.name = name;
    }

    boolean hasLegs() {
        return !(this.variant.getType().equals("Modern"));
    }

    void displayLegsStatus() {
        System.out.print(this.variant.getType() + " " + this.name + " ");
        if (this.hasLegs()) {
            System.out.println("has legs.");
        } else {
            System.out.println("does not have legs");
        }
    }
}

class Chair extends Product {
    public Chair(Variant variant) {
        super(variant, "Chair");
    }

    void sitOn() {
        System.out.println("I am sitting on " + this.variant.getType() + " " + this.name);
    }
}

class Sofa extends Product {

    public Sofa(Variant variant) {
        super(variant, "Sofa");
    }

    void sitOn() {
        System.out.println("I am sitting on " + this.variant.getType() + " " + this.name);
    }

}

class CoffeeTable extends Product {

    public CoffeeTable(Variant variant) {
        super(variant, "Coffee Table");
    }

    void keepOn() {
        System.out.println(this.variant.getType() + " " + this.name + " is kept on  floor");
    }

}

/**
 * Abstract Factory
 * Product Family - Furniture
 * Products - Chair, Sofa, and CoffeeTable
 */
class FurnitureFactory {
    Variant variant;

    FurnitureFactory(Variant variant) {
        this.variant = variant;
    }

    Chair createChair() {
        return new Chair(this.variant);
    }

    Sofa createSofa() {
        return new Sofa(this.variant);
    };

    CoffeeTable createCoffeeTable() {
        return new CoffeeTable(this.variant);
    };
}

class Client {
    private Chair chair;
    private Sofa sofa;
    private CoffeeTable coffeeTable;

    Client(FurnitureFactory factory) {
        this.chair = factory.createChair();
        this.sofa = factory.createSofa();
        this.coffeeTable = factory.createCoffeeTable();
    }

    void useFurniture() {
        this.chair.sitOn();
        this.sofa.sitOn();
        this.coffeeTable.keepOn();

        this.chair.displayLegsStatus();
        this.sofa.displayLegsStatus();
        this.coffeeTable.displayLegsStatus();
    }

}

public class BridgePatternEg {
    public static void main(String[] args) {
        Variant victorian = new Victorian();
        Variant modern = new Modern();

        FurnitureFactory modernFactory = new FurnitureFactory(modern);
        FurnitureFactory victorianFactory = new FurnitureFactory(victorian);

        Client client1 = new Client(modernFactory);
        Client client2 = new Client(victorianFactory);

        client1.useFurniture();
        System.out.println();
        client2.useFurniture();

    }
}
