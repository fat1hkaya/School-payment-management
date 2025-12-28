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
        veli.paysFees(50000);
        Teacher mine = new Teacher(4,"Mine",70000);
        school.addTeacher(mine);
        System.out.println("School was earned "+school.getTotalMoneyEarned()+" TL");

        System.out.println("--------School's Pay Salary ----------");
        fatma.receiveSalary(fatma.getSalary());
        System.out.println("School spent for salary to "+fatma.getName()+" and now has "+school.getTotalMoneyEarned()+" TL");
        mehmet.receiveSalary(mehmet.getSalary());
        System.out.println("School spent for salary to "+mehmet.getName()+" and now has "+school.getTotalMoneyEarned()+" TL");
        ahmet.receiveSalary(ahmet.getSalary());
        System.out.println("School spent for salary to "+ahmet.getName()+" and now has "+school.getTotalMoneyEarned()+" TL");


    }
}
