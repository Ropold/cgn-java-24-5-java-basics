package StudentsList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Student student1 = new Student("John","Wick",1);
        Student student2 = new Student("John","Wayne",2);
        Student student3 = new Student("Tom","Riddl",3);


        School school1 = new School();
        school1.addStudent(student1);
        school1.addStudent(student2);
        school1.addStudent(student3);


        //school1.printAllStudents();
        //school1.findStudentByID(3);
        school1.removeStudentById(3);
        school1.printAllStudents();



    }
}
