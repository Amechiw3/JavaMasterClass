package ControlFlowStatements;

public class WhileLoop {
    public static void main(String[] args) {
        int count = 0;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        for (count = 1; count != 6 ; count++) {
            System.out.println("Count value is " + count);
        }

        count = 1;
        do {
            System.out.println("Count value is " + count);
            count++;
        } while (count != 6);


        /*  Create a method called isEvenNumber that takes a parameter of type int
         *  Its purpose is to determine if the argument passed to the method is
         *  an even number or not
         *  return true if an even number, otherwise return false;
         */

        
        /*  Modify the while code above
         *  Make it also record the total number of even numbers it has found
         *  and break once 5 are found
         *  and at the end, display the total number of even numbers found
         */

        int number = 0;
        int finishNumber = 50;
        int foundNumber = 0;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even Number " + number);

            foundNumber++;
            if (foundNumber == 5)
                break;
        }
        System.out.println("Found even number " + foundNumber);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
