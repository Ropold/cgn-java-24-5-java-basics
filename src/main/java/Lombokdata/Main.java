package Lombokdata;

public class Main {
    public static void main(String[] args) {


        Student student1 = new Student(1,"John Wayne","USA","13+","Beginner");
        Student student1Improve = student1.withLvl("Advanced");

        System.out.println(student1);
        System.out.println(student1Improve);

        Student student2 = Student.builder()
                .id(2)
                .name("John Bonjovi")
                .address("USA")
                .grade("11+")
                .build();

        System.out.println(student2);

        Teacher teacher1 = new Teacher(1,"John Wick","fighting");
        System.out.println(teacher1);

        Course course1 = new Course(1,"FightClub",teacher1,student1);
        System.out.println(course1);

    }
}
