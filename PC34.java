import java.util.Scanner;

public class PC34{
    public static void main(String [ ] args)
    {
      Scanner scanner = new Scanner(System.in);

        
        double score1;
        double score2;
        double score3;
        double average;

        System.out.println("Enter the first score here:");
        score1 = scanner.nextDouble();

        System.out.println("Enter the second score here:");
        score2 = scanner.nextDouble();

        System.out.println("Enter the third score here:");
        score3 = scanner.nextDouble();


       average = score1 + score2 + score3 / 3;

        if (average <= 100);
          System.out.println( "The average score is: %"+ average +". You get a grade A.");

        if (average < 90);
          System.out.println( "The average score is: %"+ average +". You get a grade B.");

        if (average < 80);
            System.out.println( "The average score is: %"+ average +". You get a grade C.");

        if (average < 70);
            System.out.println( "The average score is: %"+ average +". You get a grade D.");

        if (average < 60);
            System.out.println( "The average score is: %"+ average +". You get a grade F.");

       

    }

}

