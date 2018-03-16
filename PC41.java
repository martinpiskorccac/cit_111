import java.util.Scanner;

public class PC41
{
    public static void main(String [ ] args)
    {
        Scanner scanner = new Scanner(System.in);

        int num = -1;
        int sum = 0;

        System.out.println("Enter a positive integer over 0.");
        num = scanner.nextInt();

        while(num < 1){
            System.out.println("Did you pass basic math in elementary school? Enter a positive integer over 0, now, please.");
            num = scanner.nextInt();
        }

        for (int number = 1; number <= num; number++ ){
            sum = sum + number;
            
        }
        System.out.println("The sum of numbers from 1 to " + num + " is " + sum);


        
       



        
    }
}

