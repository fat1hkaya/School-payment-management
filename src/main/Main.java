import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        Teacher mehmet = new Teacher(1,"mehmet",50000);
        Teacher ahmet = new Teacher(2,"ahmet",40000);
        Teacher fatma = new Teacher(3,"fatma",60000);
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(mehmet);
        teacherList.add(ahmet);
        teacherList.add(fatma);

        Student ali = new Student(1,"Ali",90);
        Student veli = new Student(2,"Veli",95);
        Student nuri = new Student(3,"Nuri",80);
        List<Student> studentList = new ArrayList<>();
        studentList.add(ali);
        studentList.add(veli);
        studentList.add(nuri);

        School school = new School(teacherList,studentList);
        ali.paysFees(60000);
        System.out.println("School was earned "+school.getTotalMoneyEarned());

    }
}
