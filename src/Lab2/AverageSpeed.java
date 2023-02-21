package Lab2;

import java.util.Scanner;

public class AverageSpeed {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input kilometers: ");
        double kilo = in.nextDouble();
        double mile = kilo/1.6;
        System.out.print("Input time in minute and second: ");
        Double min = in.nextDouble();
        Double sec = in.nextDouble();
        double hour= min/60+(sec/3600);
        System.out.print("The average speed is: "+(mile/hour));
    }
}
