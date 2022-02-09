import java.util.*;
public class NumToWords {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        switch(n){
            case 1:
                System.out.println("One");break;
            case 2:
                System.out.println("Two");break;
            case 3:
                System.out.println("Three");break;
            case 4:
                System.out.println("Four");break;
            case 5:
                System.out.println("Five");break;
            default:
                System.out.println("Entered n Value is More than 5");
    }
}
