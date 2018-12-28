package ExpressionsStatementsCodeBlocks;

public class AreaCalculator {

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5, 4));
        System.out.println(area(-1, 4.0));
    }
    public static final double INVALID_VALUED = -1.0;
    public static double area(double radius) {
        if (radius < 0) {
            return INVALID_VALUED;
        }
        return Math.PI * Math.pow(radius, 2);
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return INVALID_VALUED;
        }
        return (x * y);
    }
}
