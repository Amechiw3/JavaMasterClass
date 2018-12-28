package ExpressionsStatementsCodeBlocks;

public class PlayingCat {
    public static void main(String[] args) {
        if ( isCatPlaying(true, 10) ) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        if ( isCatPlaying(false, 36) ) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        if ( isCatPlaying(true, 35) ) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer && (temperature >= 25 && temperature <= 45) ) {
            return true;
        } else if (!summer && (temperature >= 25 && temperature <= 35) ) {
            return true;
        } else {
            return false;
        }
    }
}
