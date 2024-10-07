package JavaStatic;

public class Main {
    public static void main(String[] args) {
        Counter count1 = new Counter();
        Counter count2 = new Counter();

        System.out.println("count1 am Anfang: " + count1);
        count1.incrementInstanceCount();
        count1.incrementTotalCount();
        System.out.println("count1 nach increment: " + count1);

        System.out.println("count2 am Anfang: " + count2);
        count2.incrementInstanceCount();
        count2.incrementTotalCount();
        System.out.println("count2 nach increment: " + count2);


        int resultAdd1 = Calculator.add(5,3);
        System.out.println("resultadd1 = "+ resultAdd1);
        System.out.println("inline = " + Calculator.add(12,3));

        int resultSubtraction1 = Calculator.subtraction(5,3);
        System.out.println("resultSubtraction1 = "+ resultSubtraction1);
        System.out.println("inline = " + Calculator.subtraction(12,3));

        int resultMultiplication1 = Calculator.multiplication(5,3);
        System.out.println("resultMultiplication1  = "+resultMultiplication1);

        double resultDivision1 = Calculator.division(5,3);
        System.out.println("resultDivision1 = "+resultDivision1);
    }
}
