abstract class Product{
    Variant variant;
    protected Product(Variant variant) {
        this.variant = variant;
    }

    abstract void type();
}
class Chair extends Product{
    
    public Chair(Variant variant) {
        super(variant);
    }

    public void type(){
        System.out.println("Product is Chair & is it have legs: "+variant.hasLegs());
    }

}
class Sofa extends Product{
    public Sofa(Variant variant) {
        super(variant);
    }
    public void type(){
        System.out.println("Product is Sofa & is it have legs: "+variant.hasLegs());
    }
}
class CoffeeTable extends Product{
    public CoffeeTable(Variant variant) {
        super(variant);
    }
    public void type(){
        System.out.println("Product is Coffeetable & is it have legs: "+variant.hasLegs());
    }
}
interface Variant{
    boolean hasLegs();
}

class Victorian implements Variant{

    @Override
    public boolean hasLegs() {
        // TODO Auto-generated method stub
        return true;
    }

    
}

class Modern implements Variant{

    @Override
    public boolean hasLegs() {
        // TODO Auto-generated method stub
        return false;
    }

    
}

public class BridgeDriver {
    public static void main(String[] args) {
        Product product1 = new Chair(new Modern());
        product1.type();
    }
}