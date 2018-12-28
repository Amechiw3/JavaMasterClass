package ExpressionsStatementsCodeBlocks;

public class IfKeywordsCodeBlocks {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;
        if (score < 5000 && score > 1000){
            System.out.println("Your score was less that 5000 but great that 1000");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was" + finalScore);
        }

        /*
         *  Print out a second score on the screen with the following
         *  score set to 1000
         *  levelCompleted set to 8
         *  bonus set to 200
         *  But make sure the first print out above still display as well
         */

        boolean secondGameOver = true;
        int secondScore = 1000;
        int secondLevelCompleted = 8;
        int secondBonus = 200;

        if (gameOver) {
            int finalScore = secondScore + (secondLevelCompleted * secondBonus);
            System.out.println("Your final score was" + finalScore);
        }
    }
}
