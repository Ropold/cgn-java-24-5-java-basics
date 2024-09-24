package org.example;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello Java!!!");
        float x = 13;
        float y = 7;
        float sum = x + y;
        System.out.println("Sum: " + sum );
        float sum1 = x + y;
        System.out.println("Sum+: " + sum1 );
        float sum2 = x - y;
        System.out.println("Sum-: " + sum2 );
        float sum3 = x * y;
        System.out.println("Sum*: " + sum3 );
        float sum4 = x / y;
        System.out.println("Sum/: " + sum4 );

        System.out.println(x < y);

        if (x > y){
            System.out.println("x > y");
        }
        if (x == y){
            System.out.println("x == y");
        }
    }
}
