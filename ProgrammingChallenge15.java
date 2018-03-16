// This is Programming Challenge 15, homeboy

public class ProgrammingChallenge15
{
    public static void main(String[ ] args)
    {
        double sharesOfStock = 600;
        double pricePerShare = 21.77;
        double percentCommission = 0.02;
        double amtPaidStockNoCom;
        double comAmt;
        double totalAmt;

       amtPaidStockNoCom = sharesOfStock * pricePerShare;
       comAmt = amtPaidStockNoCom * percentCommission;
       totalAmt = comAmt + amtPaidStockNoCom;

        System.out.println("Amount paid for stock w/o commission: $" + amtPaidStockNoCom);
        System.out.println("Commission amount: $" + comAmt);
        System.out.println("Total amount paid (including the commission amount): $" + totalAmt);


    }
}