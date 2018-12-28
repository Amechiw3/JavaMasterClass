package ControlFlowStatements;

public class SumOddRange {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
        System.out.println(sumOdd(10, 1000));

    }

    public  static boolean isOdd(int number) {
        return !(number < 0 || number % 2 == 0);
    }

    public static int sumOdd(int start, int end) {
        int summary = 0;
        if ((start > 0 && end > 0) && (start <= end)) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i))
                    summary += i;
            }
            return summary;
        }
        return -1;
    }
}
