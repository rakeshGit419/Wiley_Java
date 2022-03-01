package user_data_migration;

import java.io.*;
import java.lang.reflect.Field;

public class FetchUser  {
    public static void main(String[] args) throws IOException {
        ObjectInputStream in = null;
        FileInputStream fin = null;
        try {
            // Reading the object file
            fin = new FileInputStream("userdata.txt");
            // Creating stream to read the object
            in = new ObjectInputStream(fin);

            User s = (User) in.readObject();
            System.out.println("user record retrieved");

            Class cls = s.getClass();
            Field f1 = cls.getDeclaredField("password");
            f1.setAccessible(true);
            f1.set(s,"234");

            System.out.println(s);

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            // closing the stream
            in.close();
            // closing the file input stream
            fin.close();
        }
    }
}
