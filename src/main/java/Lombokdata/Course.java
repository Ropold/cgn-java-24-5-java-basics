package Lombokdata;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class Course {
    private int id;
    private String name;
    private Teacher teacher;
    private Student student;
}
