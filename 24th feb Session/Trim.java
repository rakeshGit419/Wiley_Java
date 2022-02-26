
public class Trim {
    static String trim(String s){
        int n = s.length(),i = 0,j = n - 1;
        while (i < n && s.charAt(i)==' '){i++;}
 
        while (j >= 0 && s.charAt(i)==' '){j--;}
        return s.substring(i, j + 1);
    }
    public static void main(String[] args) {
        String str = "    ShowBot Rakesh   ";
        System.out.println("before trim - "+str);
        
        System.out.println("After trim - "+trim(str));

    }
}
