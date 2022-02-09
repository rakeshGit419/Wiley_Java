import java.util.*;

public class userInput {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        String str = scanner.next();

        while(!str.equals("q")){
            count++;
            str = scanner.next();
        }

        System.out.println("count of Inputs: "+count);

        scanner.close();
    }
}
