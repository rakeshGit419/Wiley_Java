
class Thread1 extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("5 X"+i+" = "+(5*i));
        }
        System.out.println("t1 terminating");
    }
}

class Thread2 implements Runnable{
    public void run(){
        String[] arr = {"India","USA","UK","UAE","Italy"};
        for(String i:arr) System.out.println(i);
        System.out.println("t2 terminating");
    }
    
}

public class ThreadTak{
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();
        Thread2 t = new Thread2();
        Thread t2 = new Thread(t);
        t2.start();
        System.out.println("Main terminating");
    }
}