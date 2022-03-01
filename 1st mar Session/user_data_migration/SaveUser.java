package user_data_migration;

import java.io.*;

class SaveUser {
    public static void main(String... args) {
        try (FileOutputStream fout = new FileOutputStream("userdata.txt");
                ObjectOutputStream out = new ObjectOutputStream(fout);) {
            // Creating the object
            User s1 = new User("ShowBot","showbot@gmail.com","123456");
            // Write the object into the file
            out.writeObject(s1);
            // Flush the output stream pipe
            out.flush();
            System.out.println("user record saved");
        } catch (Exception e) {
            System.out.println("failure");
            System.out.println(e);
        }
    }
}
