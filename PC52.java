import javax.swing.JOptionPane;

public class PC52 {
    public static double calculatedRetail(double wholesaleCost, double markupPercentage) {

        double retailPrice;
        double calculatedRetail;
        retailPrice = ((markupPercentage / 100) * wholesaleCost) + wholesaleCost;
        return retailPrice;
    }


public static void main(String [] args) {

    String userInput;
    double wholesaleCost;
    double markupPercentage;
    double calculatedRetail;

    userInput = JOptionPane.showInputDialog("What's the wholesale cost of the item?: ");
    wholesaleCost = Double.parseDouble(userInput);
    
    userInput = JOptionPane.showInputDialog("What's the markup percentage?: ");
    markupPercentage = Double.parseDouble(userInput);
    
    JOptionPane.showMessageDialog( null, String.format("The item with a wholesale cost of $%.2f and" + 
    " a markup percentage of %.2f%% has a retail price " + 
    " of $%.2f%", + wholesaleCost, markupPercentage, calculatedRetail( wholesaleCost, markupPercentage)));

    System.exit(0);
}

}


