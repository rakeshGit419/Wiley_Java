class Height{
    int feets;
    int inches;
    public Height(int feets, int inches) {
        this.feets = feets;
        this.inches = inches;
    }
    @Override
    public String toString() {
        return "Height [feets=" + feets + ", inches=" + inches + "]";
    }
}

abstract class Student{
    String name;
    String branch;
    Height height;
    public static int compareByHeight(Student s1,Student s2){
        if(s1.height.feets == s2.height.feets){
            if(s1.height.inches == s1.height.inches) return 0;
            else if(s1.height.inches < s1.height.inches) return -1;
            else return 1;
        }else if(s1.height.feets < s2.height.feets) return -1;
        else return 1;
    }
}

class EEEStudent extends Student{
    public EEEStudent(String name,String height,String branch) {
        this.name = name;
        this.height = height;
        this.branch = branch;
    }
}

class ECEStudent extends Student{
    public ECEStudent(String name,String height,String branch) {
        this.name = name;
        this.height = height;
        this.branch = branch;
    }
}

class CSEStudent extends Student{
    public CSEStudent(String name,String height,String branch) {
        this.name = name;
        this.height = height;
        this.branch = branch;
    }
}

class StudentAdministration{
    public void sortByHeight(){

    }
}

public class UniversityDriver_Multithreading{
    public static void main(String[] args) {
        
    }
}