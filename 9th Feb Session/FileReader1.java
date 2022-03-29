import java.util.*;
import java.io.*;

public class FileReader1 {
	public static void main(String[] args) throws FileNotFoundException{
		File file = new File("userdata.xml");
	    Scanner sc = new Scanner(file);
	    MyBean b = new MyBean();

	    while(sc.hasNextLine()){
			String ch = sc.nextLine().trim();
			if(ch.equals("<first_name>")){
				b.setFirstname(sc.nextLine().trim());
			}
			if(ch.equals("<last_name>")){
				b.setLastname(sc.nextLine().trim());
			}
        }
		System.out.println(b);
	}
}

class MyBean {
	String firstname;
	String lastname;
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

    @Override
    public String toString() {
        return "MyBean [firstName=" + firstname + ", lastName=" + lastname + "]";
    }	
}