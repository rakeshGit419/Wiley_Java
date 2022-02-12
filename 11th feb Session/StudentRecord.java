
class Student{
    private static final String university = "VMEG";
    private static int count = 0;
    private int rollNo;
    private String name;
    private String homeTown;
    Student(){
        rollNo = ++count;
        name = "Name";
        homeTown = "HomeTown";
    }

    Student(String name){
        rollNo = ++count;
        this.name = name;
        homeTown = "HomeTown";
    }

    Student(String name,String homeTown){
        rollNo = ++count;
        this.name = name;
        this.homeTown = homeTown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public void display(){
        System.out.println("Name: "+name+"\nRollNo: "+rollNo+"\nUniversity: "+university+"\nHomeTown: "+homeTown+"\n");
    }
    
}

public class StudentRecord {
    public static void main(String[] args){
        Student student = new Student("ShowBot","Hyderabad");
        student.display();
        Student student2 = new Student("Rakesh","Attapur");
        student2.display();
    }
}
