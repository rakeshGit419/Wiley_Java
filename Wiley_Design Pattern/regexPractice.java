

public class regexPractice{
    public static void main(String[] args) {
        String type = "false";
        if((type.matches("\\d+")))
            System.out.println("Integer");
        else if((type.matches("\\d+.\\d+")))
            System.out.println("Double");
        else if((type.matches("[a-zA-Z]")))
            System.out.println("Character");
        else if((type.matches("true|false")))
            System.out.println("Boolean");
    }
}