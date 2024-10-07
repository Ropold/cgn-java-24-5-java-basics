package JavaStatic;

public class Counter {
    static int totalCount = 0;
    int instanceCount = 0;

    //constructor


    //Methoden
    public static void incrementTotalCount(){
        totalCount ++;
    }

    public void incrementInstanceCount(){
        instanceCount ++;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "totalCount=" + totalCount +
                ", instanceCount=" + instanceCount +
                '}';
    }
}
