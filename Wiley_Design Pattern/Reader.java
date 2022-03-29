

import java.util.*;
import java.io.*;

public class Reader {
	public static void main(String[] args) throws FileNotFoundException{
		File file = new File("data.txt");
	    Scanner sc = new Scanner(file);
	    MyBean b = new MyBean();
	    b.setFirstname(sc.nextLine());
	    b.setLastname(sc.nextLine());
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
	public static MyBean getInstance(){
        return new MyBean();
    }

    @Override
    public String toString() {
        return "MyBean [firstName=" + firstname + ", lastName=" + lastname + "]";
    }
	
}

