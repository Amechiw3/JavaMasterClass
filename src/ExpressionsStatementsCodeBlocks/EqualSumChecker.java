package ExpressionsStatementsCodeBlocks;

public class EqualSumChecker {
    public static void main(String[] args) {
        if ( hasEqualSum(9, 99, 19) ) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }

    public static boolean hasEqualSum(int first, int second, int result) {
        return first + second == result;
    }
}
