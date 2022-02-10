import java.util.*;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] scores = new int[10];
        int max = 0;

        // a) initialize an array with 0
        for (int i = 0; i < 10; i++)
            scores[i] = 0;

        // b) take 10 inputs as scores
        Scanner scanner = new Scanner(System.in);
        System.out.println("jnkdna: ");
        for (int i = 0; i < 10; i++) {
            scores[i] = scanner.nextInt();
            if (max < scores[i])
                max = scores[i];
        }
        scanner.close();

        // c) add 1 to each of the ten elements
        for (int i = 0; i < 10; i++) {
            scores[i]++;
        }

        // d) display top 5 scores
        int[] freqSort = new int[max + 1];
        for (int i : scores)
            freqSort[i]++;
        for (int i = max; i >= 0; i--) {
            if (freqSort[i] != 0) {
                System.out.println(i);
            }
        }
    }
}
