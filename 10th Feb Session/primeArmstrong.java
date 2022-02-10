public class primeArmstrong {
    public static boolean armStrong(int n){
        int s=0,orig = n;
        while(n>0){
            int d = n%10;
            s+=Math.pow(d,3);
            n /= 10;
        }
        return orig==s;
    }
    public static boolean isprime(int n){
        if(n<=1 || (n%2==0 && n>2)) return false;
        for(int i=3;i<(int)(n*0.5)+1;i++){
            if(n%i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        int n = 153;
        for(int i=1;i<=n;i++){
            if(isprime(i)){
                System.out.println(i+" is prime");
            }else {
                // System.out.println(armStrong(i));
                if(armStrong(i)){
                    System.out.println("arm Strong Num");
                }else System.out.println("not an arm Strong Num");
            }
        }
    }
}
