public class numCheck {
    public static void evenOrOdd(int n){
        System.out.println(n+" is an "+(((n&1)==0)?"even":"odd")+" number");
    }
    public static void main(String[] args){
        evenOrOdd(4);
    }
}
