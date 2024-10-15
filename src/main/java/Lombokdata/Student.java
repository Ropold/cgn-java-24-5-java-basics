package Lombokdata;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.With;

@AllArgsConstructor
@Data
@Builder
public class Student {
    private int id;
    private String name;
    private String address;
    private String grade;

    @With
    private String lvl;

}
