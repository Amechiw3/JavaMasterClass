package ExpressionsStatementsCodeBlocks;

public class BarkingDog {
    public static void main(String[] args) {
        if ( bark(true, 8) ) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }

    public static boolean bark(boolean barking, int hourOfDay) {
        boolean wakeUp = false;
        if ( barking == true ) {
            if ( hourOfDay >= 0 && hourOfDay <= 24 ) {
                if ( hourOfDay < 8 || hourOfDay > 22 ) {
                    wakeUp = true;
                }
            }
        }
        return wakeUp;
    }
}
