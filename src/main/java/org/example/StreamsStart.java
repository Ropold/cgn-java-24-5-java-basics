package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsStart {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0) //aufgabe 1
                .peek(number -> System.out.println(number)) // Aufgabe 5
                .map(n -> n*2) //aufgabe 2
                .sorted() //aufgabe 3
                .collect(Collectors.toList()); //Aufgabe 6

        //Aufgabe 4:
        int sum = evenNumbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Summe evenNumbers: " + sum);




        List<String> names = List.of("Alice", "Bob", "Charlie", "David");

        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

//        System.out.println(upperCaseNames);
//        System.out.println(names);
        System.out.println(evenNumbers);
    }
}
