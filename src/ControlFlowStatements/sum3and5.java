package ControlFlowStatements;

public class sum3and5 {
    /*  Create a for statement using a range of numbers form 1 to 1000 inclusive
     *  Sum all the numbers that can be divided with both 3 and also with 5
     *  For those numbers that met the above conditions, print out the number
     *  break out of the loop once tou find 5 numbers that met the above conditions.
     *  After breaking out of the loop print the sum of the thatnumbers that met the above conditions
     *  Note: Type all code in main method
     */

    public static void main(String[] args) {
        int summary = 0;
        int numberFound = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                summary += i;
                System.out.println("Found number " + i);
                numberFound++;
                if (numberFound == 5)
                    break;
            }
        }
        System.out.println("Summary " + summary);
    }
}
