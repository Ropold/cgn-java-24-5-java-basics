package Lombokdata;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class Course {
    int id;
    String name;
    Teacher teacher;
    Student student;
}
