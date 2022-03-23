
class Abc{
    // Rule-1: define a static instance of own class
    static Abc obj = new Abc();   
    
    private Abc(){
        // Rule-2: define a private constructor
        System.out.println("constructor");
    }
    
    // Rule-3: define a static method which everytime
    // returns an instance of a class
    
    public static Abc getInstance(){
        return obj;
    }
}
public class singletonDriver {
	public static void main(String[] args) {
		// Abc obj1 = new Abc();
        // this kind of object creation is not possible since we made constructor as private
        
        Abc obj1 = Abc.getInstance();
        // Abc obj2 = Abc.getInstance();
        // both obj's will get same instance of a class
	}
}





