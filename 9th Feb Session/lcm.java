public class lcm {

    public static int getGcd(int divisor,int divident){

        int remainder;
        while(divisor % divident != 0){
            remainder = divisor % dividend;
            divisor = dividend;
            dividend = remainder;
        }

        return dividend;

    }

    public static void main(String[] args){
        int x = 6,y = 6;
        int lcm = (x*y)/getGcd(x,y);
        System.out.println(lcm); 
    }
}
