package StudentDB;

public class Main {

    public static void main(String[] args) {
        StudentRepo studentRepo = new StudentRepo();
        StudentService studentService = new StudentService();

        Student newStudent = Student.builder()
                .name("Florian")
                .subject("Geschichte")
                .build();

        Student savedStudent = studentService.addNewStudent(newStudent);
        studentRepo.findStudentById("abc");

        //System.out.println("Student saved: " + savedStudent);



    }
}