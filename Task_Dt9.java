public class Task_Dt9 {
    public static void square(int n){
        System.out.println("square of "+n+" is "+n*n);
    }
    public static void Details(String name,String city,String hobby){
        System.out.println("Name: "+name);
        System.out.println("City: "+city);
        System.out.println("Hobby: "+hobby);
    }
    public static void swap(int a,int b){
        System.out.println("Before swap: "+a+" "+b);
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("After swap: "+a+" "+b);
    }
    public static void evenOrOdd(int n){
        System.out.println(n+" is an "+(((n&1)==0)?"even":"odd")+" number");
    }
    public static void main(String[] args) {
        square(2);System.out.println();
        Details("ShowBot","Hyderabad","Games");System.out.println();
        swap(20,40);System.out.println();
        evenOrOdd(4);
    }
}
