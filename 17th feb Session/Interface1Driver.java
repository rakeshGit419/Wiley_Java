import java.util.Scanner;

interface in1{
    void display(int p);
}

class testCase implements in1{

    private boolean isPrime(int n){
        if((n<2)||((n%2 == 0)&&(n>2))) return false;
        for(int i=3;i<(int)Math.pow(n,0.5)+1;i+=2){
            if(n%i == 0) return false;
        }
        return true;
    }
    @Override
    public void display(int p) {
        int count = 0;
        for(int i = 2;i<=p;i++){
            if(isPrime(i)) count++;
        }
        System.out.println(count);
    }

}

public class Interface1Driver {
    public static void main(String[] args) {
        testCase testcase = new testCase();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
            int p = scanner.nextInt();
            testcase.display(p);
        }


    }
}
