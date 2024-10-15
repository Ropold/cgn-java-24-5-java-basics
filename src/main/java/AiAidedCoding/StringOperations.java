package AiAidedCoding;

public class StringOperations {

    public StringOperations() {
    }


    public String reverseString3(String str) {
        String returnstring = "";
        for (int i = str.length()-1; i >= 0; i-- ) {
            returnstring += str.charAt(i);
        }
        System.out.println(returnstring);
        return returnstring;
    }

    public void reverseString2(String str) {
        String returnstring = "";
        for (int i = str.length()-1; i >= 0; i-- ) {
            returnstring += str.charAt(i);
        }
        System.out.println(returnstring);
        return;
    }

    public static void reverseString(String str) {
        String returnstring = "";
        for (int i = str.length()-1; i >= 0; i-- ) {
            returnstring += str.charAt(i);
        }
        System.out.println(returnstring);
    }

    public static boolean palindrome(String str) {
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Normalize the string
        int len = cleanedStr.length();

        for (int i = 0; i < len / 2; i++) {
            if (cleanedStr.charAt(i) != cleanedStr.charAt(len - i - 1)) {
                System.out.println("is not palindrome");
                return false;
            }
        }
        System.out.println("is palindrome true");
        return true;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

       public static void genFirstNPrimes(int n) {
        int count = 0;
        int num = 2;
        while (count < n) {
            if (isPrime(num)) {
                System.out.println(num); // Print the prime number
                count++;
            }
            num++;
        }
    }


}
