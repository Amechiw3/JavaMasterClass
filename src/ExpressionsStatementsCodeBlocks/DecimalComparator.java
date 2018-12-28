package ExpressionsStatementsCodeBlocks;

public class DecimalComparator {
    public static void main(String[] args) {
        if ( areEqualByThreeDecimalPlaces(-3.1756, 3.175) ) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        return ((long) (firstNumber * 1000)) == ((long) (secondNumber * 1000));
    }
}
