import java.util.*;
public class compare {
    public static int compareNum(int m){
        return (m>0)?1:((m<0)?-1:0);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter m value: ");
        int m = scanner.nextInt();
        System.out.println(compareNum(m));

    }
}


