package StudentDB;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentRepoTest {

    @Test
    public void ifStudentExist (){

        //given
        Student student1 = new Student("12","john wick","math");
        StudentRepo studentRepo1 = new StudentRepo();
        studentRepo1.save(student1);

        //when
        Student actual = studentRepo1.findStudentById(student1.id());


        //then
        assertEquals(student1.id(),actual.id());
    }

    @Test
    public void ifStudentNotExist (){

        //given
        StudentRepo studentRepo1 = new StudentRepo();

        //when
        //studentRepo1.findStudentById("abc");


        //then
        assertThrows(StudentNotFoundException.class,()-> studentRepo1.findStudentById("abc"));
    }





}
