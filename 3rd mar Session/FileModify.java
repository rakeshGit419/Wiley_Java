import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

public class FileModify{
    public static void main(String[] args) throws IOException {
 
        FileReader fr = new FileReader("playground.txt");
        BufferedReader br = new BufferedReader(fr);

        String str = br.readLine();
   
        String updatedStr = str.substring(0, 5) + " R " + str.substring(5);
   
        br.close();
   
        FileWriter writer = new FileWriter("playground.txt");
        writer.write(updatedStr);
        writer.close();
    }   
}