



















public class HappyNumDriver{
    public static void main(String[] args) {
        int k = 4;
        System.out.println(k);
        checkHappyNumber(k);
    }

    private static void checkHappyNumber(int k) {
        int ori_k = k;
        while(k>1){
            k = getSquareDigits(k);
            System.out.println(k);
            if(k == ori_k) break;
        }
    }

    private static int getSquareDigits(int k) {
        if(k<=1) return k;
        int n = k%10;
        return (n*n)+getSquareDigits(k/10);
    }
}