import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Employee {
    protected long   employeeId;
    protected String firstName;
    protected String lastName;
    
    public Employee(long employeeId, String firstName, String lastName) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public boolean isEqual(Employee other){
        if((other == null) || (!(other instanceof Employee))) return false;
        if(this == other) return true;
        return ((this.employeeId==other.employeeId) && this.firstName.equals(other.firstName));
    }

    public int compareTo(Employee other){
        if(this.employeeId == other.employeeId) return 0;
        else if(this.employeeId > other.employeeId) return 1;
        return -1;
    }
    
    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }
    
}



public class Task{
    public static void main(String[] args) {
        Employee p1 = new Employee(107,"Rakesh","A");
        Employee p2 = new Employee(100,"Prem","A");
        Employee p3 = new Employee(102,"Bobby","G");
        List<Employee> arrList = new ArrayList<>();
        arrList.add(p1);
        arrList.add(p2);
        arrList.add(p3);
        arrList.forEach(System.out::println);
        System.out.println(p1.isEqual(p2));
        System.out.println(p1.compareTo(p2));

        for(int i=0;i<arrList.size();i++){
            for(int j=0;j<arrList.size()-1-i;j++){
                if(arrList.get(j).compareTo(arrList.get(j+1)) == 1){
                    Employee p4 = arrList.get(j+1);
                    arrList.set(j+1, arrList.get(j));
                    arrList.set(j, p4);
                }
            }
        }
        arrList.forEach(System.out::println);
    }
}