package StudentsList;

import java.util.ArrayList;
import java.util.List;

public class School {
    List<Student> students = new ArrayList<>();

    public School() {
    }

    public School(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public Student findStudentByID(int ID){

        for(Student student : students){
            if(student.getStudentId() == ID){
                System.out.println(student);
               return student;
            }
        }
        System.out.println("Id not found");
        return null;

    }

    public void removeStudentById(int id){
        for(Student student : students){
            if(student.getStudentId() == id){
                students.remove(student);
                return;
            }
        }
        System.out.println("Id not found");
    }


    public void printAllStudents(){
        for(Student student : students){
            System.out.println(student);
        }
    }


    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }
}
