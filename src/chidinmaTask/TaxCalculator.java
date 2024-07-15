package chidinmaTask;

import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the citizen's name: ");
        String citizenName = scanner.nextLine();

        System.out.print("Enter earnings for " + citizenName + " (in USD): ");
        double earnings = scanner.nextDouble();


        double tax;
        if (earnings <= 30000) {
            tax = 0.15 * earnings;
        } else {
            tax = 0.15 * 30000 + 0.20 * (earnings - 30000);
        }

        System.out.println(citizenName + "'s total tax: $" + tax);
    }
}

