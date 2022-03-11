public class fibonacci{
    static void getFibonacciSeries(int n){
        int n1 = 0,n2 = 1,counter = 0;
        // System.out.print(n1+" "+n2+" ");
        while(counter<n){
            System.out.print(n1+" ");
            counter++;
            int n3 = n1+ n2;
            n1 = n2;
            n2 = n3;
            
        }
    }
    public static void main(String[] args){
        getFibonacciSeries(10);
    }
}