class Student{
    private int rollNo;
    private String name;
    Student(){
        rollNo = -1;
        name = "Name";
    }

    Student(int rollNo){
        this.rollNo = rollNo;
        name = "Name";
    }

    Student(String name){
        rollNo = -1;
        this.name = name;
    }

    Student(int rollNo,String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("rollNo: "+rollNo);
    }

    void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }

    int getRollNo(){
        return rollNo;
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }
}

public class StudentDetails {
    public static void main(String[] args){
        Student student = new Student();
        student.setRollNo(201);
        student.setName("ShowBot");
        student.display();

        Student student2 = new Student();
        student2.setRollNo(419);
        student2.setName("Rakesh");
        student2.display();

    }
}
