import java.util.Scanner;			

public class PC39
{
	public static void main (String[] args)
	{ 

Scanner input = new Scanner(System.in);	
double distance = 0.0;									
double rate;	
int weight = 0;																						
int distanceM = (int)distance / 500;	
int distanceR;									
		


System.out.println("What's the weight of the package (in pounds)?");
weight = input.nextInt();

System.out.println("What's the shipping distance (in miles)?");
distance = input.nextDouble();

distanceR = (int)distance % 500; 
if (distanceR == 0)
// for this part below i looked at some online tutorials because it was giving me so much grief and even then i think i messed it up
	{
	if (weight <= 2)
		System.out.println("The total shipping cost is: $" + (distanceM * 1.10));
		}
	else if (weight > 2 && weight <= 6)
	{
		System.out.println("The total shipping cost is: $" + (distanceM * 2.20));
		}
	else if (weight > 6 && weight <= 10)
	{
		System.out.println("The total shipping cost is: $" + (distanceM * 3.70));
		}
	else
	{
		System.out.println("The total shipping cost is: $" + (distanceM * 3.80));
		}
		
if (distanceR != 0)
	{
		if (weight <= 2)
		System.out.println("The total shipping cost is: $" +(distanceM + 1) * 1.10);
		}
	else if (weight > 2 && weight <= 6)
	{
		System.out.println("The total shipping cost is: $" +(distanceM + 1) * 2.20);
		}
	else if (weight > 6 && weight <= 10)
	{
		System.out.println("The total shipping cost is: $" +(distanceM + 1) * 3.70);
		}
	else
	{
		System.out.println("The total shipping cost is: $" +(distanceM + 1) * 3.80); 
		
		System.exit(0);
}


    }
    
}
