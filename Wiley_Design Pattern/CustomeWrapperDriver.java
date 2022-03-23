interface MyWrapper{
    void printType();
}

class MyInteger implements MyWrapper{
    @Override
    public void printType() {System.out.println("Integer");}
}
class MyDouble implements MyWrapper{
    @Override
    public void printType() {System.out.println("Double");}
}
class MyBoolean implements MyWrapper{
    @Override
    public void printType() {System.out.println("Boolean");}
}
class MyCharacter implements MyWrapper{
    @Override
    public void printType() {System.out.println("Character");}
}

class MyWrapperFactory{
    public MyWrapper getMyWrapperInstance(String value) {
        if(value == null) return null;
        else if(value.matches("\\d+")) return new MyInteger();
        else if(value.matches("\\d+.\\d+")) return new MyDouble();
        else if(value.matches("true|false")) return new MyBoolean();
        else if(value.matches("[a-zA-Z]")) return new MyCharacter();
        else throw new IllegalArgumentException("Unknown Type");
    }
}

public class CustomeWrapperDriver {
    public static void main(String[] args) {
        
        MyWrapperFactory myFact = new MyWrapperFactory();
        MyWrapper myWrapper1 = myFact.getMyWrapperInstance("143");
        myWrapper1.printType();
        MyWrapper myWrapper2 = myFact.getMyWrapperInstance("3.14");
        myWrapper2.printType();
        MyWrapper myWrapper3 = myFact.getMyWrapperInstance("true");
        myWrapper3.printType();
        MyWrapper myWrapper4 = myFact.getMyWrapperInstance("R");
        myWrapper4.printType();
    }
}
