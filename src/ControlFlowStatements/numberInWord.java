package ControlFlowStatements;

public class numberInWord {
    public static void main(String[] args) {

    }

    public static final String[] NUMBER_IN_WORD = { "ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE" };
    public static final String INVALID_NUMBER = "OTHER";
    public static void printNumberInWord(int number) {
        switch (number) {
            case 0: case 1: case 2: case 3: case 4:
            case 5: case 6: case 7: case 8: case 9:
                System.out.println(NUMBER_IN_WORD[number]);
                break;
            default:
                System.out.println(INVALID_NUMBER);
                break;
        }
    }
}
