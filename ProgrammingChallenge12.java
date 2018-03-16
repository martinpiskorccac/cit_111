import java.util.Scanner;

public class ProgrammingChallenge12
{
    public static void main(String[ ] args)
    {
       Scanner scanner = new Scanner(System.in);

       String faveCity;

       System.out.println("What is the name of your favorite city?:");
       faveCity = scanner.nextLine();

       System.out.println("There are " + faveCity.length() + " characters in " + faveCity);
       System.out.println(faveCity + " in uppercase is: " + faveCity.toUpperCase());
       System.out.println("In lowercase, " + faveCity + " would be: " + faveCity.toLowerCase());
       System.out.println("Also, the first letter in " + faveCity + " is: " + faveCity.charAt(0));

    }

}