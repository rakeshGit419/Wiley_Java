import java.util.*;
import java.util.stream.*;

class Employee {
    int id;
    String name; 
    int age;
    String gender; 
    String department;  
    int yearOfJoining;
    double salary;
      
    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) 
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }
      
    public int getId() 
    {
        return id;
    }
      
    public String getName() 
    {
        return name;
    }
      
    public int getAge() 
    {
        return age;
    }
      
    public String getGender() 
    {
        return gender;
    }
      
    public String getDepartment() 
    {
        return department;
    }
      
    public int getYearOfJoining() 
    {
        return yearOfJoining;
    }
      
    public double getSalary() 
    {
        return salary;
    }
      
    @Override
    public String toString() 
    {
        return "Id : "+id
                +", Name : "+name
                +", age : "+age
                +", Gender : "+gender
                +", Department : "+department
                +", Year Of Joining : "+yearOfJoining
                +", Salary : "+salary;
    }
}

public class EmplyeStatistics{
    public static void main(String[] args) {
        Employee emp1 = new Employee(3, "Vishal Singhal", 34, "male", "HR", 2013, 300000);
        Employee emp2 = new Employee(4, "Amitabh Singh", 35, "male", "Admin", 2014, 500000);
        Employee emp3 = new Employee(5, "Vivek Bhati", 28, "male", "Admin", 2017, 500000);
        Employee emp4 = new Employee(6, "Vipul Diwan", 34, "male", "Account", 2014, 200000);
        Employee emp5 = new Employee(7, "Satish Kumar", 29, "male", "Account", 2017, 75000);
        Employee emp6 = new Employee(8, "Geetika Chauhan", 30, "female", "Admin", 2016, 90000);
        
        List<Employee> empList = Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6);

        //1 count 
        Map<String,Integer> mapDeptCount = new HashMap<>();
        for(Employee e : empList)
            mapDeptCount.put(e.getDepartment(), mapDeptCount.getOrDefault(e.getDepartment(), 0)+1);
        System.out.println(mapDeptCount);


        //2 salary 
        Map<String,Double> mapSalary = empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
        // System.out.println(mapSalary);
        //3 highest pay 
        Optional<Employee> highPay = empList.stream().max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println(highPay);

        //4 avg age
        IntSummaryStatistics empAge = empList.stream().collect(Collectors.summarizingInt(Employee::getAge));
        // System.out.println(empStats.getAverage());

        //5 & 6 -> senior-most & junior-most
        String senior = "";
        String junior = "";
        int mxExp = Integer.MIN_VALUE;
        int mnExp = Integer.MAX_VALUE;
        for(Employee i: empList){
            if(mxExp < (2022 - i.getYearOfJoining())){
                mxExp = 2022 - i.getYearOfJoining();
                senior = i.toString();
            }
            if(mnExp > (2022 - i.getYearOfJoining())){
                mnExp = 2022 - i.getYearOfJoining();
                junior = i.toString();
            }
        }
        // System.out.println(senior);
        // System.out.println(junior);

        //8  
        Map<String,Integer> mapGender = new HashMap<>();
        for(Employee e : empList)
            mapGender.put(e.getGender(), mapGender.getOrDefault(e.getGender(), 0)+1);
        // System.out.println(mapGender);


    
    
    }
}