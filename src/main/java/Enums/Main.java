package Enums;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Appointment a1 = new Appointment("1","Termin Eins",WeekDay.FRIDAY);

        System.out.println(a1);
        System.out.println(a1.day());
        System.out.println(a1.day().getGerman());

        WeekDay day1 = a1.day();




//        String germanDay = day1.map(WeekDay::getGerman)
//                .orElse("Kein Wochentag verfügbar");
//        System.out.println(germanDay);
    }
}
