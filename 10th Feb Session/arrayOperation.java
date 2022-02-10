import java.util.*;

public class arrayOperation {
    public static void main(String[] args) {
        int[] scores = new int[10];
        int max = 0;

        // a) initialize an array with 0
        for (int i = 0; i < 10; i++)
            scores[i] = 0;

        // b) take 10 inputs as scores
        Scanner scanner = new Scanner(System.in);
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
        System.out.println(Arrays.toString(scores));

        // d) display top 5 scores
        int[] freqSort = new int[max + 2];
        for (int i : scores)
            freqSort[i]++;
        
        int c = 0;
        for(int i=(max+1);i>=0;i--){
            if(freqSort[i] != 0) {
                System.out.println(i);c++;
                if(c==5) break;
            }
        }
    }
}

