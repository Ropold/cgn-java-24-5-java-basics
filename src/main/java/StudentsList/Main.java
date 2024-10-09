package StudentsList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        Student student1 = new Student("John","Wick",1);
        Student student2 = new Student("John","Wayne",2);
        Student student3 = new Student("Tom","Riddl",3);


        School school1 = new School();



//        students.put("Alice", new Student("Alice", "Smith", 12345));
//        students.put("Bob", new Student("Bob", "Jones", 23456));
//
//        boolean hasBob = students.containsKey("Bob");
//        System.out.println(hasBob);

//        school1.addStudent(student1);
//        school1.addStudent(student2);
//        school1.addStudent(student3);

        //school1.printAllStudents();
        //school1.findStudentByID(3);
        //school1.removeStudentById(1);
        //school1.printAllStudents();

       school1.addStudent("Bob", new Student("Bob", "Jones", 23456));
       school1.addStudent("John", new Student("John", "Wayne", 1321));
       System.out.println(school1.getStudents());



    }
}
