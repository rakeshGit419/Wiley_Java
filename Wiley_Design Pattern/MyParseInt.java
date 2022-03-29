class MyNumber{
    private String value;

    public MyNumber() {
    }

    public MyNumber(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyNumber [value=" + value + "]";
    }
}

class Request{
    private MyNumber myNumber;

    Request(MyNumber myNumber) {
        this.myNumber = myNumber;
    }

    public MyNumber getNumber() {
        return myNumber;
    }
}

abstract class Handler {
    protected Handler nextHandler;

    Handler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(Request request) {
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}

class NegativeNumberHandler extends Handler {
    NegativeNumberHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        String n = request.getNumber().getValue();
        if(n.matches("^[-][^0][0-9]+")) {System.out.println("negative");return;}
        super.handle(request);
    }
}

class ZeroHandler extends Handler {
    ZeroHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        String n = request.getNumber().getValue();
        if(n.matches("0+")) {System.out.println("zero");return;}
        super.handle(request);
    }
}

class PositiveNumberHandler extends Handler {
    PositiveNumberHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        String n = request.getNumber().getValue();
        if(n.matches("[+]?[^0][0-9]+")) {System.out.println("positive");return;}
        super.handle(request);
    }
}

class NotAnIntegerHandler extends Handler {
    NotAnIntegerHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        String n = request.getNumber().getValue();
        if((!(n.matches("0+"))) && (!n.matches("[+]?[^0][0-9]+")) &&(!n.matches("^[-][^0]\\d+")))
        {
            throw new NumberFormatException("Invalid Number");
        }
        super.handle(request);
    }
}

class Chain {
    Handler firstHandler;

    Chain() {
        buildChain();
    }

    private void buildChain() {
        this.firstHandler = new NegativeNumberHandler(new ZeroHandler(new PositiveNumberHandler(new NotAnIntegerHandler(null))));
    }

    public void initiateChain(Request request) {
        firstHandler.handle(request);
    }
}

public class MyParseInt {
    public static void main(String[] args) {

        MyNumber myNumber = new MyNumber("-0120");
        Request request = new Request(myNumber);
        try{
        Chain myNumberBuildingChain = new Chain();
        myNumberBuildingChain.initiateChain(request);

        System.out.println(request.getNumber());
        }catch(NumberFormatException e){
            System.out.println(e);
        }
    }
}