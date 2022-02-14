import java.util.Objects;

class Person{
    protected String name;
    Person(){
        name = "Name";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Employee extends Person{
    private double salary;
    private int year;
    private String UAN;

    Employee(){
        salary=0;
        year=0;
        UAN = "000000000000";
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getUAN() {
        return UAN;
    }
    public void setUAN(String uAN) {
        UAN = uAN;
    }
    @Override
    public String toString() {
        return "Employee Name = " + super.getName() + "\nSalary = " + salary + "\nSince = " + year + "\nUAN = " + UAN+ "\n";
    }
    
}
public class Practice {
    public static void main(String[] args){
        //1st
        Employee e = new Employee();
        e.name = "ShowBot";
        e.setYear(2022);
        e.setSalary(100);
        e.setUAN("129510100006168");
        System.out.println(e.toString());

        //2nd
        Person p = new Person();
        p.name = "Rakesh";

        Employee e1 = new Employee();
        e.name = "Rakesh";

        System.out.println("person object and employee object: "+(p.getName().equals(e.getName())));

        //3rd
        Employee e2 = new Employee();
        e.name = "Prem";
        e.setYear(2022);
        e.setSalary(100);
        e.setUAN("129510100006668");
        System.out.println(e.toString());

        System.out.print("Checking Two objects of Employee class: ");
        System.out.println((p.getName().equals(e.getName())) && (e.getSalary() == e2.getSalary()) && (e.getYear() == e2.getYear()) && (e.getUAN() == e2.getUAN()));

        
        
    }
}