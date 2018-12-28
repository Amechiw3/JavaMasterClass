package ExpressionsStatementsCodeBlocks;

public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(561600L);
    }
    public static final String INVALID_VALUE = "Invalid Value";
    public static void printYearsAndDays(Long minutes) {
        /*
        if (minutes < 0) {
            System.out.println(INVALID_VALUE);
        } else {
            long hours = minutes / 60;
            long days = (hours / 24) % 365;
            long years = (hours / 24) / 365;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }*/
        if ( minutes <= 0 ) {
            System.out.println("Invalid Value");
        } else {
            long years = ((minutes / 60) / 24) / 365;
            long days = ((minutes / 60) / 24) % 365;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
