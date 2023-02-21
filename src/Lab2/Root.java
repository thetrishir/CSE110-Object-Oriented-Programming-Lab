package Lab2;

import java.util.Scanner;

public class Root {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter values for a, b and c: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        Double discriminant = b*b-4*a*c;
        if (discriminant>0){
            double r1 = (-b+Math.pow(discriminant,0.5))/(2*a);
            double r2 = (-b-Math.pow(discriminant,0.5))/(2*a);
            System.out.print("The equation has two real roots "+r1+" and "+r2);
        }
        else if(discriminant==0){
            double r1 = (-b)/(2*a);
            System.out.print("The equation has one real root "+r1);
        }
        else
        System.out.print("The equation has no real roots");
    }
}
