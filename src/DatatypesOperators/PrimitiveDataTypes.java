package DatatypesOperators;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        String myString = "This is a string";
        System.out.println(myString);
        myString += ", and this is more.";
        System.out.println("myString is equal to " + myString);

        myString += " \u0049 2018";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString += "49.95";
        System.out.println("The result is " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString += myInt;
        System.out.println("LastSring is equal to" + lastString);
    }
}
