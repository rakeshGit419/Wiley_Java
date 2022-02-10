public class gcd {

    public static int getGcd(int divisor,int dividend){

        int remainder;
        while(divisor % dividend != 0){
            remainder = divisor % dividend;
            divisor = dividend;
            dividend = remainder;
        }

        return dividend;

    }

    public static void main(String[] args){
        System.out.println(getGcd(60,96)); //12
    }
}
