package Lab2;

import java.util.Scanner;

public class CenteredOrNot {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the center (p,q) and the radius (r) of a circle: ");
        double p = in.nextDouble();
        double q = in.nextDouble();
        double r = in.nextDouble();
        System.out.print("Enter a point (x, y): ");
        double x = in.nextDouble();
        double y = in.nextDouble();
        double a = x-p, b = y-q;
        if (r*r>=a*a+b*b){
            System.out.print("Inside the circle");
        }
        else
        System.out.print("Outside the circle");
    }
}
