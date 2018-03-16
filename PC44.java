import java.util.Scanner;

public class PC44
{
    public static void main(String [ ] args)
    {
        Scanner scanner = new Scanner(System.in);

        int days;
        int pennyday;
        int allpenny = 0;
        final int  PENNY_IN_DOLLAR = 100;
        double wage = 0;

        System.out.println("How many days have you worked?");
        days = scanner.nextInt();

        while(days < 1){
            System.out.println("Dude. You can't work less than one day unless you're me, unemployed at age 18.");
            days = scanner.nextInt();
        }
        System.out.println("Day\tPennies For the day\n----\t----------------\n");
        for (int day = 1; day <= days; day++){
            pennyday = (int)(Math.pow( 2 , day - 1 ));
            System.out.println(day + "\t" + pennyday);
            allpenny = allpenny + pennyday;
            
        }
        wage = (double)allpenny / PENNY_IN_DOLLAR;
        System.out.println("You made $" + wage);


        
       



        
    }
}
