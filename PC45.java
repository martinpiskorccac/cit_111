import java.util.Scanner;

public class PC45
{
    public static void main(String[ ] args)
    {
       Scanner scanner = new Scanner(System.in);

       String enteredString;
       String enteredChar;
       char character;
       int occurrences = 0;

       System.out.println("Hey. Bro. Put a string thingy here:");
       enteredString = scanner.nextLine();

       System.out.println("Yo. Can you do me a favor? Enter a letter/character from " + enteredString + ", okay?");
       enteredChar = scanner.nextLine();
       character = enteredChar.charAt(0);

       for(int index = 0; index < enteredString.length(); index++ ){
           if(enteredString.charAt(index) == character) {
               occurrences = occurrences + 1;
           }
       }
       System.out.println( character + " appears in " + enteredString + " " + occurrences + " times.");



       

    }

}