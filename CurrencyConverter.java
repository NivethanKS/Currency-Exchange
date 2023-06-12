import java.util.Scanner;

public class CurrencyConverter {
    private static final double CAD_TO_USD_RATE = 0.78; // Edit this to the current rate
    private static final double USD_TO_CAD_RATE = 1.28; // Edit this to the current rate

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Currency Converter!");
        System.out.println("1. CAD to USD");
        System.out.println("2. USD to CAD");
        System.out.print("Select an option (1 or 2): ");

        int option = scanner.nextInt();

        if (option == 1) {
            System.out.print("Enter amount in CAD: ");
            double amountInCAD = scanner.nextDouble();
            double amountInUSD = convertCADtoUSD(amountInCAD);
            System.out.printf("The equivalent amount in USD is: %.2f\n", amountInUSD);
        } else if (option == 2) {
            System.out.print("Enter amount in USD: ");
            double amountInUSD = scanner.nextDouble();
            double amountInCAD = convertUSDtoCAD(amountInUSD);
            System.out.printf("The equivalent amount in CAD is: %.2f\n", amountInCAD);
        } else {
            System.out.println("Invalid option selected!");
        }

        scanner.close();
    }

    public static double convertCADtoUSD(double amount) {
        return amount * CAD_TO_USD_RATE;
    }

    public static double convertUSDtoCAD(double amount) {
        return amount * USD_TO_CAD_RATE;
    }
}
