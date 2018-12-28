package ExpressionsStatementsCodeBlocks;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        System.out.println(checkNumer(0));
    }

    public static String checkNumer(int number) {
        String value = "Zero";
        if (number > 0) {
            value = "Positive";
        } else if (number < 0) {
            value = "Negative";
        }
        return value;
    }
}
