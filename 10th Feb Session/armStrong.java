public class armStrong {
    public static void main(String[] args){
        int n =153,s=0;
        int on = n;
        while(n>0){
            int d = n%10;
            s+=Math.pow(d,3);
            n /= 10;
        }
        System.out.println(on==s);
    }
}
