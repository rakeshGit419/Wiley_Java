import java.io.*;
import java.util.*;
public class FileHandlingDriver {
    public static void main(String[] args) {
        try{
            File obj = new File("ShowBot.txt");
            Scanner scn = new Scanner(obj);
            while(scn.hasNextLine()){
                System.out.println(scn.nextLine());
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
