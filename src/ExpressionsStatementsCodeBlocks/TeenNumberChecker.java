package ExpressionsStatementsCodeBlocks;

public class TeenNumberChecker {
    public static void main(String[] args) {
        if ( hasTeen(9, 99, 19) ) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }

    public static boolean hasTeen(int first, int second, int three) {
        return (first >= 13 && first <= 19) || (second >= 13 && second <= 19) || (three >= 13 && three <= 19);
    }
}
