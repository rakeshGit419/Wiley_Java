
/**
 * Product Family - Furniture
 * Product - Chair
 */
interface Chair {
    boolean hasLegs();

    void sitOn();
}

/**
 * Product Family - Furniture
 * Product - Chair
 * Variant Type - Victorian
 */
class VictorianChair implements Chair {
    @Override
    public boolean hasLegs() {
        return true;
    }

    public void sitOn() {
        System.out.println("I am sat on a Victorian Chair");
    }
}

/**
 * Product Family - Furniture
 * Product - Chair
 * Variant Type - Modern
 */
class ModernChair implements Chair {
    @Override
    public boolean hasLegs() {
        return false;
    }

    public void sitOn() {
        System.out.println("I am sat on a Modern Chair");
    }
}

/**
 * Product Family - Furniture
 * Product - Sofa
 */
interface Sofa {
    boolean hasLegs();

    void sitOn();
}
// -------------------
/**
 * Product Family - Furniture
 * Product - Sofa
 * Variant Type - Victorian
 */
class VictorianSofa implements Sofa {
    @Override
    public boolean hasLegs() {
        return true;
    }

    public void sitOn() {
        System.out.println("I am sat on a Victorian Sofa");
    }
}

/**
 * Product Family - Furniture
 * Product - Sofa
 * Variant Type - Modern
 */
class ModernSofa implements Sofa {
    @Override
    public boolean hasLegs() {
        return false;
    }

    public void sitOn() {
        System.out.println("I am sat on a Modern Sofa");
    }
}
// -------------------

/**
 * Product Family - Furniture
 * Product - CoffeeTable
 */
interface CoffeeTable {
    boolean hasLegs();

    void keepOn();
}

// ---------------
/**
 * Product Family - Furniture
 * Product - CoffeeTable
 * Variant Type - Victorian
 */
class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public void keepOn() {
        System.out.println("I kept the coffee on VictorianCoffeeTable");
        
    }

    
}

/**
 * Product Family - Furniture
 * Product - CoffeeTable
 * Variant Type - Modern
 */
class ModernCoffeeTable implements CoffeeTable {
    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public void keepOn() {
        System.out.println("I kept the coffee on ModernCoffeeTable");
        
    }

    
}
// ---------------

// TODO: Implement the variants of Sofa and CoffeeTable products

/**
 * Abstract Factory
 * Product Family - Furniture
 * Products - Chair, Sofa, and CoffeeTable
 */
interface FurnitureFactory {
    Chair createChair();

    Sofa createSofa();

    CoffeeTable createCoffeeTable();
}

/**
 * Concrete Factory
 * Product Family - Furniture
 * Variant Type - Victorian
 */
class VictorianFactory implements FurnitureFactory {
    public Chair createChair() {
        return new VictorianChair();
    }

    // TODO: Implement appropriate object creation
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    // TODO: Implement appropriate object creation
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}

/**
 * Concrete Factory
 * Product Family - Furniture
 * Variant Type - Modern
 */
class ModernFactory implements FurnitureFactory {
    public Chair createChair() {
        return new ModernChair();
    }

    // TODO: Implement appropriate object creation
    public Sofa createSofa() {
        return new ModernSofa();
    }

    // TODO: Implement appropriate object creation
    public CoffeeTable createCoffeeTable() {

        return new ModernCoffeeTable();
    }
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
        // TODO: Uncomment and use Sofa and CoffeeTable
        this.sofa.sitOn();
        this.coffeeTable.keepOn();

        // TODO: For each furniture, print whether it has legs or not
        System.out.println(chair.hasLegs());
        System.out.println(sofa.hasLegs());
        System.out.println(coffeeTable.hasLegs());
    }

}

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        FurnitureFactory factory1 = new ModernFactory();

        Client client1 = new Client(factory1);

        client1.useFurniture();
// ---------------------------------------------------------------------
        FurnitureFactory factory2 = new VictorianFactory();

        Client client2 = new Client(factory2);

        client2.useFurniture();
    }
}
