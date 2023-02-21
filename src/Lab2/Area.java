package Lab2;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Radius: ");
        double rad = in.nextDouble();
        double pi = 3.1415;
        double perimeter = 2 * pi * rad;
        double area = pi * rad * rad;
        System.out.println("the perimeter is: " + perimeter + "\nThe area is: " + area);

    }
}
