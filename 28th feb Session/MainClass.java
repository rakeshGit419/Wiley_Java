class OddThread extends Thread {
    int limit;
    Printer printer;
    public OddThread(int limit, Printer printer) {
        this.limit = limit;
        this.printer = printer;
    }
    @Override
    public void run(){
        int oddNumber = 1;    
        while (oddNumber <= limit) {
            printer.printOdd(oddNumber);      
            oddNumber = oddNumber + 2;        
        }
    }
}
class EvenThread extends Thread {
    int limit;
    Printer printer;
    public EvenThread(int limit, Printer printer) {
        this.limit = limit;
        this.printer = printer;
    }
    @Override
    public void run() {
        int evenNumber = 2;           
        while (evenNumber <= limit){
        printer.printEven(evenNumber);          
        evenNumber = evenNumber + 2;           
        }
    }
}
class Printer {
    boolean isOddPrinted = false;
    synchronized void printOdd(int number) {
        while (isOddPrinted) {
            try {
                wait();
            } 
            catch (Exception e) {}
        }
        System.out.println(Thread.currentThread().getName()+" - "+number);
        isOddPrinted = true;
        try{
            Thread.sleep(1000);
        } 
        catch (Exception e){}
        notify();
    }
    synchronized void printEven(int number) {
        while (! isOddPrinted){
            try{
                wait();
            }
            catch (Exception e) {}
        }
        System.out.println(Thread.currentThread().getName()+" - "+number);
        isOddPrinted = false;
        try{
            Thread.sleep(1000);
        } 
        catch (Exception e) {}
        notify();
    }
}
//Main Class
public class MainClass {
    public static void main(String[] args) {
        Printer printer = new Printer();
        OddThread oddThread = new OddThread(20, printer);
        oddThread.setName("Odd-Thread");
        EvenThread evenThread = new EvenThread(20, printer);
        evenThread.setName("Even-Thread");
        oddThread.start();
        evenThread.start();
    }
}