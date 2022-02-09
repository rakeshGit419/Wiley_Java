import java.util.*;
public class checkForLeapYear {

    public static boolean check(int year){
        return ((year%4 == 0) && (year%100 != 0)) || (year%400 == 0);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        if(check(year)) System.out.println(year+" is a Leap year");
        else System.out.println(year+" is a Leap year");

    }
}
