import java.util.Arrays;

public class Driver{
    public static void main(String[] args) {

        String s1 = "KeeP";
        String s2 = "Peek";

        if (s1.length() != s2.length())
            System.out.println("False-Not an Anagram");
        else {  
            char[] S1 = s1.toLowerCase().toCharArray();  
            char[] S2 = s2.toLowerCase().toCharArray();  
            
            Arrays.sort(S1);  
            Arrays.sort(S2);  
            
            if(Arrays.equals(S1, S2)) System.out.println("Anagram");
            else System.out.println("False-Not an Anagram");
        }

    }
}