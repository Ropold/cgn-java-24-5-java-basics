package org.example;

public class SimpleCalculation {
    public static void main(String[] args){

        int number1 = 34;
        int number2 = 8;
        double sum1 = calc(number1, number2);
        double sub1 = sub(number1, number2);

//        System.out.println(calc(3,6));
//        System.out.println(sub(3,6));
//        System.out.println(sum1);
//        System.out.println(sub1);
//        System.out.println(makePositive(number1));
//        System.out.println(checkEven(number1));
        System.out.println(isPalindrome("abba"));

//        if(number1 > number2){
//            System.out.println(sub(number1, number2));
//        } else {
//            System.out.println(calc(number1, number2));
//        }


}
    public static boolean isPalindrome(String str){
        int length = str.length();
        for (int i = 0; i < length/2; i++) {
            if (str.charAt(i) != str.charAt(length-i-1)) {
                return false;
            }
        }
        return true;
    }

    public static int checkEven(int number){
        if(number % 2 == 0){
            return number;
        } else {
            return number * 2;
        }
    }
    public static double calc(int number1, int number2){
        return number1 + number2;
    }

    public static double sub(int number1, int number2){
        return number1 - number2;
    }

    public static int makePositive (int number1){
        if (number1 < 0){
            number1 = -number1;
        }
        return (number1);
    }

}


