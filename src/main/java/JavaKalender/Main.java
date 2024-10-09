package JavaKalender;

import java.sql.SQLOutput;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };


        for (String month : months) {
            System.out.println(month);
            System.out.println("Mo  Di  Mi  Do  Fr  Sa  So");
            for (int k = 1; k <= 31; k++) {
                System.out.print(k + "\t");
                if(k % 7 == 0){
                    System.out.println();
                }
                if (k % 31 == 0){
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
}

