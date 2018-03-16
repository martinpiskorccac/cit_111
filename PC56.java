public class PC56 {
    public static double celsius(double tempFah) {
        double celsius;
        celsius = (5 / 9) * ( tempFah - 32);
        return celsius;
    }

    public static void displayHeader() {
        System.out.println("fahrenheit\t temperature\t\t Celsuis equivalent\n-------------------------\t\t\t----------------------------\n");
    }

    public static void main(String [] args) {
        displayHeader();
        double celsiusEquivalent;
        for(double currentFahTemp = 0; currentFahTemp <= 20; currentFahTemp++ ) {
            celsiusEquivalent = 5 / 9 * ( currentFahTemp - 32);
            System.out.println(currentFahTemp + "\t\t\t\t" + celsiusEquivalent);
        }
    }
}

