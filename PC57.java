import java.util.Scanner;

public class PC57{
    public static double calcAverage(double score1, double score2, double score3, double score4, double score5 ) {
      Scanner scanner = new Scanner(System.in);

        double average;
        average = ( score1 + score2 + score3 + score4 +score5 ) / 5;
        return average; 

    }

    public static String determineGrade( double testScore ) {
        String letterGrade = "";
        if( testScore < 60 ) {
            letterGrade = "F";
        } else if( testScore < 70 ) {
            letterGrade = "D";
        } else if( testScore < 80 ) {
            letterGrade = "C";
        } else if( testScore < 90 ) {
            letterGrade = "B";
        } else if( testScore < 100) {
            letterGrade = "A";
        }
        return letterGrade;
    }

    public static void main(String [] args ){
        Scanner scanner = new Scanner(System.in);
        
        int numberOfScores = 5;
        double userScore;
        double score1 = 0;
        double score2 = 0;
        double score3 = 0;
        double score4 = 0;
        double score5 = 0;
        String outputString = "Score\t\t\tLetter Grade\n";

        for(int currentScore = 1; currentScore <= numberOfScores; currentScore++ ) {
            System.out.println("Enter score" + currentScore );
            userScore = scanner.nextDouble();

            if( currentScore == 1) {
                score1 = userScore;
                outputString += score1 + "\t\t\t" + determineGrade(score1) + "\n";
            } else if( currentScore == 2 ){
                score2 = userScore;
                outputString += score2 + "\t\t\t" + determineGrade(score2) + "\n";
            } else if( currentScore == 3 ) {
                score3 = userScore;
                outputString += score3 + "\t\t\t" + determineGrade(score3) + "\n";
            } else if( currentScore == 4){
                score4 = userScore;
                outputString += score4 + "\t\t\t" + determineGrade(score4) + "\n";
            } else if(currentScore == 5) {
                score5 = userScore;
                outputString += score5 + "\t\t\t" + determineGrade(score5) + "\n";
            }
        }
        System.out.print( outputString + "Average: " + calcAverage( score1, score2, score3, score4, score5 ));
    }

}

