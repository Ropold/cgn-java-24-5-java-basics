package AiAidedCoding;

public class Main {
    public static void main(String[] args) {

        String a = "abc";

        StringOperations.reverseString(a);
        StringOperations.palindrome(a);

        StringOperations name = new StringOperations();

        name.reverseString2(a);
        name.reverseString3(a);

    }



}