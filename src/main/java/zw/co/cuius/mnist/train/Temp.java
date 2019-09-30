package zw.co.cuius.mnist.train;

import java.util.ArrayList;
import java.util.List;

public class Temp {

    public static void main(String[] args) {

        System.out.println(longestBlank("Hello wo rld "));
        System.out.println(toInteger("-1234"));
        System.out.println(reverseString("Terrence"));
        System.out.println(prime(23));
        System.out.println(sumDivisors(8));

        String[] words = {"Hello", "this", "is", "a", "test"};
        System.out.println(concat(words));
    }
    public static int longestBlank(String str){
        return (int) str.chars().filter(Character::isWhitespace).count();
    }

    public static int toInteger(String str) {
        int startAtIndex = 0, number = 0;
        boolean isNegative = false;

        // check if negative and start at index 1
        if (str.charAt(0) == '-') {
            isNegative = true;
            startAtIndex = 1;
        }

        for (char i: str.substring(startAtIndex).toCharArray()){
            if(!Character.isDigit(i)){
                System.out.println(i+" is not a digit");
                return 0;
            }
            number *= 10;
            number += (str.charAt(startAtIndex++) - '0');
        }

        if (isNegative)
            number = -number;
        return number;
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static boolean prime(int n) {

        //check if n is an even number
        if (n % 2 == 0)
            return false;

        //if not, then just check the odds
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static int sumDivisors(int n) {

        List<Integer> divisors = new ArrayList<>();

        // populate the list with divisors
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }

        // now add up the elements in the list
        int sum = 0;
        for (Integer i : divisors) {
            sum += i;
        }

        return sum;
    }

    public static String concat(String[] words) {

        //concatenate the array with no spaces in between
        return String.join("", words);
    }
}
