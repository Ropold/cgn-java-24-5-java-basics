package org.example;


import java.util.Arrays;

public class ArrayBasics {
    public static void main(String[] args) {

        int[] myNum = {1, 2, 3, 4, 15, 6, 7, 8, 9, 10};
        int[] results = new int[10];

        int result1 = 0;
        for (int i : myNum) {
            result1 = result1 + i;
        };
        System.out.println("result1 = " + result1);

        int resultBigestNumber = 0;
        for (int i : myNum) {
            if(i > resultBigestNumber){
                resultBigestNumber = i;
            }
        };
        System.out.println("bigest zahl = " + resultBigestNumber);

        int[] myNum2 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int result2 = 0;
        for (int i : myNum2) {
            result2 = result2 + i;
        };
        System.out.println("result2 = " + result2);

        System.out.println("array 1 + 2 = " + (result1 + result2));


        for (int i = 0; i < myNum.length; i++){
            results[i] = myNum[i] + myNum2[i];
        }

        System.out.println(Arrays.toString(results));

     /*   for (int i = 0; i < myNum.length; i++) {
            System.out.println(i);
        };*/
    }
}