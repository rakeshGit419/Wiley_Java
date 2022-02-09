public class Swapping {
    public static void swap(int a,int b){
        System.out.println("Before swap: "+a+" "+b);
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("After swap: "+a+" "+b);
    }
    public static void main(String[] args){
        swap(20,40);
    }
}
