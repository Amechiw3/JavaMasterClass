package ExpressionsStatementsCodeBlocks;

public class SecondAndMinutesChallenger {
    public static void main(String[] args) {
        System.out.println( getDurationString(50,70) );
        System.out.println( getDurationString(36000) );
    }

    public static String getDurationString(int minutes, int seconds) {
        if(minutes < 0 || (seconds < 0 || seconds > 59)) {
            return "Invalid value";
        }
        int hours = ( minutes / 60 );
        int remainingMinutes = ( minutes % 60 );

        String hoursString = hours + "hh ";
        if (hours == 0) {
            hoursString = "";
        } else if (hours < 10){
            hoursString = "0" + hoursString;
        }

        String minutesString = remainingMinutes + "mm ";
        if (remainingMinutes < 10) {
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "ss ";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }

        return hoursString + minutesString + secondsString;
    }

    public static String getDurationString(int seconds) {
        if((seconds < 0)) {
            return "Invalid value";
        } else {
            return getDurationString(seconds / 60, seconds % 60);
        }
    }
}
