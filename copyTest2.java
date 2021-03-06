package Package1;


import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}


public class Test2 {
    public static void main(String[] args) {
        Student st1 =new Student("Ivan", 'm',22,3,8.3);
        Student st2 =new Student("Nikolay", 'm',28,2,6.4);
        Student st3 =new Student("Elena", 'f',19,1,8.3);
        Student st4 =new Student("Petr", 'm',35,4,8.3);
        Student st5 =new Student("Mariya", 'f',23,3,8.3);
        List<Student>studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);
        System.out.println(studentList);
        studentList.remove(st5);
        System.out.println(studentList);

    }

}
