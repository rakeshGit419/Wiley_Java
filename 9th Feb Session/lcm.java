public class lcm {

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
        int x = 6,y = 6;
        int lcm = (x*y)/getGcd(x,y);
        System.out.println(lcm); 
    }
}
