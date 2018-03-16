import java.util.Scanner;

 public class PC47
 {
     public static void main(String [] args)
     {
         Scanner scanner = new Scanner(System.in);


         int occupiedRoom = 0;
         int totalRoom = 0;
         int roomPerFloor;
         int occRate;
         int floors;

         System.out.println("Yo homeboy how many floors your hotel got?");
         floors = scanner.nextInt();

         System.out.println("How many rooms are there on each floor man?");
         roomPerFloor = scanner.nextInt();

         System.out.println("How many rooms are occupied altogether?");
         occupiedRoom = scanner.nextInt();
 
         while(floors < 1){
             System.out.println("That's not a REAL hotel. C'mon man.");
             floors = scanner.nextInt();
         }

        while(roomPerFloor < 10){
            System.out.println("You call that adequate housing for your guests?????");
            roomPerFloor = scanner.nextInt();
        }
        
        totalRoom = roomPerFloor * floors;

        occRate = occupiedRoom / totalRoom;

         System.out.println("The occupation rate in your hotel is " + occRate);

         // oh god im too tired to fix the running error just take it
     }
     


 }