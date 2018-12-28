package ExpressionsStatementsCodeBlocks;

public class LeapYear {
    public static void main(String[] args) {
        if ( isLeapYear(1800) ) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }

    public static boolean isLeapYear(int year) {
        return ( (year > 0 && year <= 9999) && ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0));
    }
}
