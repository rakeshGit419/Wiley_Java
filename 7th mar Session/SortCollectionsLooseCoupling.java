import java.util.*;

interface Client {
    double getCharges();
    double calculatePayment(GregorianCalendar invoiceDate);
    void sendEmail(double payment);
}

class Clients implements Client, Comparable<Clients> {
    int id;
    String name;
    String email;
    double charges;
    GregorianCalendar dateOfAgreement;

    public Clients(int id, String name, String email, double charges) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.charges = charges;
        this.dateOfAgreement = new GregorianCalendar();
    }

    public GregorianCalendar getDateOfAgreement() {
        return dateOfAgreement;
    }

    @Override
    public int compareTo(Clients o) {
        return this.id - o.id;
    }

    @Override
    public double calculatePayment(GregorianCalendar invoiceDate) {
        return getDays(invoiceDate.getTime(), this.dateOfAgreement.getTime()) * charges;
    }

    @Override
    public void sendEmail(double payment) {
        System.out.println("Your Pending with :" + payment);
    }

    protected long getDays(Date d1, Date d2) {
        return (d1.getTime() - d2.getTime()) / (1000 * 3600 * 24);
    }
}

class Customer extends Clients {

    public Customer(int id, String name, String email, double charges) {
        super(id, name, email, charges);
    }

    @Override
    public String toString() {
        return "Customer [charges=" + charges + ", dateOfAgreement=" + dateOfAgreement.getTime() + ", email=" + email
                + ", id="
                + id + ", name=" + name + "]";
    }
}

class Business extends Clients {
    private final double GST_RATE = 18;

    public Business(int id, String name, String email, double charges) {
        super(id, name, email, charges);
    }

    @Override
    public double calculatePayment(GregorianCalendar invoiceDate) {
        return (getDays(invoiceDate.getTime(), this.dateOfAgreement.getTime()) * charges*GST_RATE)/100;
    }

    @Override
    public String toString() {
        return "Business [GST_RATE=" + GST_RATE + ", charges=" + charges + ", dateOfAgreement="
                + dateOfAgreement.getTime()
                + ", email=" + email + ", id=" + id + ", name=" + name + "]";
    }

}

public class SortCollectionsLooseCoupling{
    public static void main(String[] args) {

        Clients c1 = new Customer(101, "ShowBot", "showbot@email.com", 2000);
        Clients c2 = new Customer(105, "Rakesh", "rakesh@email.com", 3000);
        Clients b1 = new Business(102, "Wipro", "wipro@email.com", 200);
        Clients b2 = new Business(103, "Infosys", "infosys@email.com", 300);

        List<Clients> list = Arrays.asList(c1,c2,b1,b2);

        List<Double> pendingPayments = new ArrayList<>();

        list.forEach(ele -> pendingPayments.add(ele.calculatePayment(new GregorianCalendar(2022, 2, 31))));
        pendingPayments.forEach(System.out::println);
        for (int i = 0; i < list.size(); i++) {
            list.get(i).sendEmail(pendingPayments.get(i));
        }

        Collections.sort(list);
        list.forEach(System.out::println);

        Collections.sort(list, (a, b) ->(int)(a.getCharges() - b.getCharges()));

        list.forEach(System.out::println);

        Collections.sort(list,(a, b) -> (int) (a.dateOfAgreement.getTimeInMillis() - b.dateOfAgreement.getTimeInMillis()));

        list.forEach(System.out::println);

    }
}
