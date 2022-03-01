import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class kiosk{
    public static void main(String... args){
        try (FileOutputStream fout = new FileOutputStream("accounts.txt");
                ObjectOutputStream out = new ObjectOutputStream(fout);) {
            // Creating the object
            BankAccount s1 = new BankAccount("1295100006168", "ShowBot", 10000);
            // Write the object into the file
            out.writeObject(s1);
            // Flush the output stream pipe
            out.flush();
            System.out.println("success");
        } catch (Exception e) {
            System.out.println("failure");
            System.out.println(e);
        }
    }
}

