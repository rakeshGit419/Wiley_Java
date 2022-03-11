import java.util.*;
import java.util.stream.*;
class Student implements Comparable<Student>{
    private String name;
    private int id;
    private String subject;
    double percentage;

    public Student(String name, int id, String subject, double percentage) {
        this.name = name;
        this.id = id;
        this.subject = subject;
        this.percentage = percentage;
    }

    public String getName() {return name;}

    public int getId() {return id;}

    public String getSubject() {return subject;}

    public double getPercentage() {return percentage;}
    @Override
    public String toString() {
        return name + "-" + id + "-" + subject + "-" + percentage;
    }

    @Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
        return (int)(o.percentage - this.percentage);
    }

    

    
}

public class StudentStatistics{
    public static void main(String[] args){

        Student student1 = new Student("Dinesh", 1, "Algorithms", 75);
        Student student2 = new Student("Arnav", 2, "Automata", 55);
        Student student3 = new Student("Anamika", 3, "Databases", 80);
        Student student4 = new Student("Vishal", 4, "Networking", 40);
        Student student5 = new Student("Antony", 5, "Databases", 65);
        Student student6 = new Student("Vijay", 6, "Networking", 90);

        List<Student> studentList = Arrays.asList(student1,student2,student3,student4,student5,student6);
        Map<Boolean,List<Student>> stdAbove60 = studentList.stream()
        .collect(Collectors.partitioningBy(n->n.getPercentage() > 60));
        System.out.println(stdAbove60);

        Collections.sort(studentList);
        List<Student> studentTop = studentList.stream().map(n->n).limit(3).collect(Collectors.toList());
        System.out.println(studentTop);



        Map<String,Double> namePercentage = studentList.stream().collect(Collectors.toMap(Student::getName,Student::getPercentage));
        System.out.println(namePercentage);

        Set<String> set = studentList.stream().map(n->n.getSubject()).collect(Collectors.toSet());
        System.out.println(set);

        DoubleSummaryStatistics studentStats = studentList.stream().collect(Collectors.summarizingDouble(Student::getPercentage));
        System.out.println("Highest Percentage : "+studentStats.getMax());
        System.out.println("Lowest Percentage : "+studentStats.getMin());
        System.out.println("Average Percentage : "+studentStats.getAverage());

        //6 count of student
        Long countOfStudnet = studentList.stream().collect(Collectors.counting());
        System.out.println(countOfStudnet);

        Map<String,List<Student>> mapStudentBySubjects = studentList.stream().collect(Collectors.groupingBy(Student::getSubject));
        System.out.println(mapStudentBySubjects);
    }
}