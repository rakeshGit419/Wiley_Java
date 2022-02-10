public class digitExtraction {
    public static void main(String[] args){
        int n =741;
        while(n>0){
            System.out.println(n%10);
            n /= 10;
        }
    }
}
