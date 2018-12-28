package ControlFlowStatements;

public class ForLoop {
    public static void main(String[] args) {
        /*  Using the for statement, call the calculateInterest method with
         *  the amount of 10000 with an interestRate of 2, 3, 4, 5, 6, 7 and 8
         *  and print the result to the console window.
        for (int i = 2; i <= 8; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, (double) i)));
        }
         */

        /*  How would you modify the loop above to do the same thing as
         *  shown but start from 8% and work back to 2%
        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, (double) i)));
        }
         */

        int counterPrime = 0;
        for (int i = 17; i <= 30; i++) {
            if (isPrime(i)) {
                counterPrime++;
                System.out.println("Number " + i + " is a prime number");
                //if (counterPrime == 3){
                //    System.out.println("Exiting for loop");
                //    break;
                //}
            }
        }
    }

    /*  Create a for statement using any range numbers
     *  determine if the number is a prime number using the isPrime method
     *  if it is a prime number, print it out AND increment a count of the
     *  number of prime numbers found
     *  if that count is 3 the loop
     *  hint: Use the break; statement to exit;
     */



    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }
}
