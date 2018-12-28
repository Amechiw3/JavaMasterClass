package ControlFlowStatements;

public class dayOrTheWeek {
    public static void main(String[] args) {
        /*  Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day
         *  The metod should not return any value (hint: void)
         *  Using a switch statement print "Sunday", "Monday", ... , "Saturday" if the int parameter
         *  "day" is 0, 1, ... , 6 respectively, otherwise it should print "Invalid day".
         *  BONUS
         *  Write a second solution using if then else, instead of using switch.
         */
    }

    public static final String[] DAY_OF_THE_WEEK = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thuesday", "Friday", "Saturday" };
    public static final String INVALID_DAY = "Invalid Day";
    public static void switchPrintDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println(DAY_OF_THE_WEEK[day]);
                break;
            case 1:
                System.out.println(DAY_OF_THE_WEEK[day]);
                break;
            case 2:
                System.out.println(DAY_OF_THE_WEEK[day]);
                break;
            case 3:
                System.out.println(DAY_OF_THE_WEEK[day]);
                break;
            case 4:
                System.out.println(DAY_OF_THE_WEEK[day]);
                break;
            case 5:
                System.out.println(DAY_OF_THE_WEEK[day]);
                break;
            case 6:
                System.out.println(DAY_OF_THE_WEEK[day]);
                break;
            default:
                System.out.println(INVALID_DAY);
                break;

        }
    }

    public static void ifPrintDayOfTheWeek(int day) {
        if (day == 0) {
            System.out.println(DAY_OF_THE_WEEK[day]);
        } else if (day == 1) {
            System.out.println(DAY_OF_THE_WEEK[day]);
        } else if (day == 2) {
            System.out.println(DAY_OF_THE_WEEK[day]);
        } else if (day == 3) {
            System.out.println(DAY_OF_THE_WEEK[day]);
        } else if (day == 4) {
            System.out.println(DAY_OF_THE_WEEK[day]);
        } else if (day == 5) {
            System.out.println(DAY_OF_THE_WEEK[day]);
        } else if (day == 6) {
            System.out.println(DAY_OF_THE_WEEK[day]);
        } else {
            System.out.println(INVALID_DAY);
        }


    }
}
