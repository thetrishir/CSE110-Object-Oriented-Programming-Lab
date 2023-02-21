package Lab2;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the exchange rate from currency in U.S. dollars (USD): ");
        double e = in.nextDouble();
        System.out.print("Input 0 to convert from USD to BDT\n or 1 to convert from BDT to USD: ");
        int n = in.nextInt();
        switch (n) {
            case 0:
                System.out.print("Enter amount in USD: ");
                double a = in.nextDouble();
                System.out.println(a + " USD is equal to " + (a * e) + " BDT");
            case 1:
                System.out.print("Enter amount in BDT: ");
                a = in.nextDouble();
                System.out.println(a + " BDT is equal to " + (a / e) + " USD");
            default:
                System.out.print("Invalid input");
        }
    }


}