import javax.swing.*;
import javax.swing.JOptionPane;

public class PC32
{
    public static void main(String [ ] args)
    {
      
        String input;
        int month;
        int day;
        int year;

        input = JOptionPane.showInputDialog("Enter numeric month here:");
        month = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Enter numeric day here:");
        day = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Enter two digit numeric year here:");
        year = Integer.parseInt(input);

        if ((month * day) == year) {

            JOptionPane.showMessageDialog(null, "That date is magic!");

        } else {
            JOptionPane.showMessageDialog(null, "That date isn't magic. Sorry, dude.");

        }

        System.exit(0);


    }
}