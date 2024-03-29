package Serialization;

import java.io.*;

class Deserialization {
    public static void main(String args[]) throws IOException {
        ObjectInputStream in = null;
        FileInputStream fin = null;
        try {
            // Reading the object file
            fin = new FileInputStream("userdata.txt");
            // Creating stream to read the object
            in = new ObjectInputStream(fin);
            User s = (User) in.readObject();
            // printing the data of the serialized object
            System.out.println(s.rollNumber + " " + s.name);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            // closing the stream
            in.close();
            // closing the file input stream
            fin.close();
        }

        User user = new User();
    }
}
