import java.text.SimpleDateFormat;  
import java.text.ParseException;
import java.util.*;
import java.util.Date; 
import java.time.LocalDate;

interface Client{
    double getCharge();
    double calculatePayment(String invoiceDate);
    void sendEmail(double payment);
}

class Customer implements Client,Comparable<Client>{
    int id;
    String name;
    String email;
    static double charges = 120.45;
    String dateOfAgreement;
    
    public Customer(int id,String name, String email,String dateOfAgreement) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dateOfAgreement = dateOfAgreement;
    }

    @Override
    public double getCharge() {
        return charges;
    }
    static long getDays(String join_date, String leave_date){
        SimpleDateFormat obj = new SimpleDateFormat("MM-dd-yyyy");  
        try {    
            Date date1 = obj.parse(join_date);   
            Date date2 = obj.parse(leave_date);     
            long time_difference = date2.getTime() - date1.getTime(); 
            long days_difference = (time_difference / (1000*60*60*24)) % 365;   
            
            return days_difference;   
        }    
        catch (ParseException excep) {   
            return -1;   
        }   
    }

    @Override
    public double calculatePayment(String invoiceDate) {
        return getDays(invoiceDate,getTodaydate())*getCharge();
    }

    private static String getTodaydate() {
        LocalDate todaysDate = LocalDate.now();
        return todaysDate.toString();
    }

    @Override
    public void sendEmail(double payment) {
        System.out.println("Your Pending with "+payment);
    }

    @Override
    public String toString() {
        return "Customer [charges=" + charges + ", dateOfAgreement=" + dateOfAgreement + ", email=" + email + ", id="
                + id + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Client other) {
        return this.id - other.id;
    }
    
}

class Business implements Client{
    int count = 0;
    int id;
    String name;
    String email;
    static double charges = 220.5;
    static double gstRate = 5.2;
    String dateOfAgreement;

    

    public Business(int id,String name, String email, String dateOfAgreement) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dateOfAgreement = dateOfAgreement;
    }

    @Override
    public double getCharge() {
        return charges;
    }

    public double getGST(){
        return gstRate;
    }

    static long getServiceDays(String join_date, String leave_date){
        SimpleDateFormat obj = new SimpleDateFormat("MM-dd-yyyy");  
        try {    
            Date date1 = obj.parse(join_date);   
            Date date2 = obj.parse(leave_date);     
            long time_difference = date2.getTime() - date1.getTime(); 
            long days_difference = (time_difference / (1000*60*60*24)) % 365;   
            
            return days_difference;   
        }    
        catch (ParseException excep) {   
            return -1;   
        }   
    }

    @Override
    public double calculatePayment(String invoiceDate) {
        return (getServiceDays(invoiceDate,getTodaydate())*getCharge()*getGST())/100;
    }

    private static String getTodaydate() {
        LocalDate todaysDate = LocalDate.now();
        return todaysDate.toString();
    }

    @Override
    public void sendEmail(double payment) {
        System.out.println("Your Pending with "+payment);
    }

    @Override
    public String toString() {
        return "Business [charges=" + charges + ", dateOfAgreement=" + dateOfAgreement + ", email=" + email
                + ", gstRate=" + gstRate + ", id=" + id + ", name=" + name + "]";
    }
    
    
}

public class SortCollectionsDriver{
    public static void main(String[] args){
        Client c1 = new Customer(1,"ShowBot","showbot@gmail.com","02/16/2022");
        Client c2 = new Customer(3,"Rakesh","rakesh@gmail.com","02/06/2022");

        Client b1 = new Business(2,"hookaTech","hooka@gmail.com","02/17/2022");
        Client b2 = new Business(5,"TeachCom","Comp@gmail.com","02/01/2022");

        List<Client> list = Arrays.asList(c1,c2,b1,b2);
    }
}