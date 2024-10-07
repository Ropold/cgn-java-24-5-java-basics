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

        //count1.incrementTotalCount();
    }
}
