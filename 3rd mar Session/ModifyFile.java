import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class ModifyFile {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("playground.txt");
            Scanner Reader = new Scanner(file);
            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data);
                String res = "";
                int count = 0;
                for (int i = 0; i < data.length(); i++) {
                    if (data.charAt(i) == ' ') {
                        count++;
                    }
                    if (count == 2) {
                        res += "123";
                        count = -100;
                    }
                    if (i == 4) {
                        res += "@";
                    }
                    res += data.charAt(i);
                }
                System.out.println(res);
                Files.writeString(Path.of("playground.txt"), res);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}