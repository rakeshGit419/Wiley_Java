import java.util.*;
public class maxMinOfThree {

    public static int getMinofThree(int a,int b,int c){
        if(a <= b && a <= c) return a;
        else if( b <= a && b <= c) return b;
        else return c;
    }

    public static int getMaxofThree(int a,int b,int c){
        if(a >= b && a >= c) return a;
        else if( b >= a && b >= c) return b;
        else return c;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the a,b,c values: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(getMaxofThree(a,b,c));
        System.out.println(getMinofThree(a,b,c));
    }
}
