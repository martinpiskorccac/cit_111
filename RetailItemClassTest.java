public class RetailItemClassTest {
    public static void main(String [] args) {
        RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
        RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
        RetailItem item3 = new RetailItem("Shirt", 20, 24.95);

        System.out.println("\t\tDescription\tUnitsOnHand\tPrice");
        System.out.println("item #1\t\t" + item1.getDescription() + "\t\t" + item1.getUnitsOnHand() + "\t\t" + item1.getPrice());
        System.out.println("item #2\t\t" + item2.getDescription() + "\t\t" + item2.getUnitsOnHand() + "\t\t" + item2.getPrice());
        System.out.println("item #3\t\t" + item3.getDescription() + "\t\t" + item3.getUnitsOnHand() + "\t\t" + item3.getPrice());

    }
}