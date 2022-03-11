import java.util.*;
import java.util.stream.Collectors;
class Student{
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
}

public class StudentStatisticsDriver{
    public static void main(String[] args) {

        Student student1 = new Student("Dinesh", 1, "Algorithms", 75);
        Student student2 = new Student("Arnav", 2, "Automata", 55);
        Student student3 = new Student("Anamika", 3, "Databases", 80);
        Student student4 = new Student("Vishal", 4, "Networking", 40);
        Student student5 = new Student("Antony", 5, "Databases", 65);
        Student student6 = new Student("Vijay", 6, "Networking", 90);

        List<Student> studentList = Arrays.asList(student1,student2,student3,student4,student5,student6);

        //1 partition 
        Map<Boolean,List<Student>> mapOfStdAbove60 = studentList.stream().collect(Collectors.partitioningBy(student->student.getPercentage() > 60));
        // System.out.println(mapOfStdAbove60);

        //2 top 3 students 
        List<Student> top3Students = studentList.stream().sorted(Comparator.comparingDouble(Student::getPercentage).reversed()).limit(3).collect(Collectors.toList());
        // System.out.println(top3Students);

        //3 name & percentage
        Map<String,Double> namePercentage = studentList.stream().collect(Collectors.toMap(Student::getName, Student::getPercentage));
        // System.out.println(namePercentage);

        //4 subjects in college 
        Set<String> setOfSubjects = studentList.stream().map(Student::getSubject).collect(Collectors.toSet());
        // System.out.println(setOfSubjects);

        //5 high,low & avg % 
        DoubleSummaryStatistics studentStats = studentList.stream().collect(Collectors.summarizingDouble(Student::getPercentage));
        // System.out.println("Highest Percentage : "+studentStats.getMax());
        // System.out.println("Lowest Percentage : "+studentStats.getMin());
        // System.out.println("Average Percentage : "+studentStats.getAverage());

        //6 count of student
        Long countOfStudnet = studentList.stream().collect(Collectors.counting());
        // System.out.println(countOfStudnet);

        Map<String,List<Student>> mapStudentBySubjects = studentList.stream().collect(Collectors.groupingBy(Student::getSubject));
        // System.out.println(mapStudentBySubjects);
    }
}