public class stringCheck {
    public static void main(String[] args){
        // Scanner scn = new Scanner(System.in);
        String password = "Rakesh123";
        int l=0,u=0,d=0;
        for(int i=0;i<password.length();i++){
            char ch = password.charAt(i);
            if(ch>=65 && ch<=90) u++;
            else if(ch>=97 && ch<=122) l++;
            else d++;
        }
        System.out.println("lower: "+l);
        System.out.println("upper: "+u);
        System.out.println("digit: "+d);
    }
}
