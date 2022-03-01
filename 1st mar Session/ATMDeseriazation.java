import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ATMDeseriazation {
    public static void main(String[] args) throws IOException{
        ObjectInputStream in = null;
        FileInputStream fin = null;
        try {
            // Reading the object file
            fin = new FileInputStream("accounts.txt");
            // Creating stream to read the object
            in = new ObjectInputStream(fin);
            BankAccount s = (BankAccount) in.readObject();
            // printing the data of the serialized object
            System.out.println(s.accNum + " " + s.accHolder+" "+s.accBalance);
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
