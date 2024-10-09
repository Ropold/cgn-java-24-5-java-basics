package StudentsList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {
    //List<Student> students = new ArrayList<>();
    Map<String, Student> students;

    public School() {
        this.students = new HashMap<>();
    }

    public School(Map<String, Student> students) {
        this.students = students;
    }
    public void addStudent(String name, Student student){
        this.students.put(name,student);
    }

    public Map<String, Student> getStudents() {
        return students;
    }

    //    public void addStudent(Student student){
//        this.students.add(student);
//    }



//    public Student findStudentByID(int ID){
//
//        for(Student student : students){
//            if(student.getStudentId() == ID){
//                System.out.println(student);
//               return student;
//            }
//        }
//        System.out.println("Id not found");
//        return null;
//
//    }

//    public void removeStudentById(int id){
//        for(Student student : students){
//            if(student.getStudentId() == id){
//                students.remove(student);
//                return;
//               }
//        }
//        System.out.println("Id not found");
//    }


//    public void printAllStudents(){
//        for(Student student : students){
//            System.out.println(student);
//        }
//    }


}
