public class gcd {

    public static int getGcd(int divisor,int divident){

        int remainder;
        while(divisor % divident != 0){
            remainder = divisor % divident;
            divisor = divident;
            divident = remainder;
        }

        return divident;

    }

    public static void main(String[] args){
        System.out.println(getGcd(60,96)); //12
    }
}
