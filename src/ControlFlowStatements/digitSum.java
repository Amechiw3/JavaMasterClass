package ControlFlowStatements;

public class digitSum {
    /*  Write a method with the name sumDigits that has one int parameter called number
     *  if parameter is >= 10 then the method should process the number and return sum of
     *  all digits, otherwise return -1 to indicate an invalid value
     *  The numbers form 0 - 9 have 1 digit so we don't want to process them, also we dont
     *  want to process negative numbers, so also return -1 for negative numbers
     *
     *  For example calling the method sumDigits(123) should return 8 since 1 + 2 + 5 = 8.
     *  Calling the method sumDigits(1) should return -1 as per requirements described above.
     */

    public static void main(String[] args) {
        System.out.println("The sum of digits in number 1994 is " + sumDigits(1994));
    }

    public static int sumDigits(int number) {
        if (number < 10)
            return -1;
        
        int sum = 0;
        // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120
        while (number > 0) {
            //  Extract the lest-significat digit
            int digit = number % 10;
            sum += digit;

            //  Drop the least-significant digit
            number /= 10;
        }
        return sum;
    }
}
