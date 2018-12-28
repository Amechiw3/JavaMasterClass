package ControlFlowStatements;

public class SwitchStatement {
    public static void main(String[] args) {
        int value = 3;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was 3");
        }

        int switchValue = 1;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        /*  Create a new switch statement using char instead of int
         *  create a new char variable
         *  create a switch statement testing for
         *  A, B, C, D, or E
         *  display a message if any of these are fount and then break
         *  Add a default which displays a message saying not found
         */

        char letter = 'A';
        switch (letter) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Was a A, or a B, or a C, or a D, or a E");
                System.out.println("Actually it was a " + letter);
                break;
            default:
                System.out.println("Was not a A, or a B, or a C, or a D, or a E");
                break;
        }

        String month = "January";
        switch (month.toUpperCase()) {
            case "JANUARY":
                System.out.println(month + "was found");
                break;
            case "JULY":
                System.out.println(month + "was found");
                break;
            default:
                System.out.println("Not Sure");
                break;
        }
    }
}
