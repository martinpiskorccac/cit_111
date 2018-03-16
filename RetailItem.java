public class RetailItem
{
    private String description;
    private int unitsOnHand;
    private double price;

    public void setDescription(String userDescription) {
        description = userDescription;
    }

    public void setUnitsOnHand(int userUnitsOnHand) {
        unitsOnHand = userUnitsOnHand;
    }
    
    public void setPrice(double userPrice) {
        price = userPrice;
    }

    public String getDescription() {
        return description;
    }
    public int getUnitsOnHand() {
        return unitsOnHand;
    }
    public double getPrice() {
        return price;
    }

    public RetailItem(String descriptionGiven, int unitsOnHandGiven, double priceGiven) {
        description = descriptionGiven;
        unitsOnHand = unitsOnHandGiven;
        price = priceGiven;
    }

}