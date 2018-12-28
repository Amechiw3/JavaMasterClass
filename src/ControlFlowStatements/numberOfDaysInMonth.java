package ControlFlowStatements;

public class numberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(1, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }

    public static final String[] MONTH =
            {       "JANUARY",
                    "FEBRUARY",
                    "MARCH",
                    "APRIL",
                    "MAY",
                    "JUNE",
                    "JULY",
                    "AUGUST",
                    "SEPTEMBER",
                    "OCTOBER",
                    "NOVEMBER",
                    "DECEMBER"
            };

    public static final String INVALID_NUMBER = "OTHER";

    public static final int[] DAYS_MONTH = {    31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31  };
    public static boolean isLeapYear(int year) {
        return ( (year > 0 && year <= 9999) && ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0));
    }
    public static int getDaysInMonth(int month, int year) {
        if ((month >= 1 && month <= 12) && (year > 0 && year <= 9999)) {
            if (isLeapYear(year) && month == 2) {
                return DAYS_MONTH[month - 1] + 1;
            } else {
                return DAYS_MONTH[month - 1];
            }
        } else {
            return -1;
        }
    }
}
