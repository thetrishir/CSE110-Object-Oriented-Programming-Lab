package Lab2;

import java.util.Scanner;

public class Divisible {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = in.nextInt();
        if ((n % 2 == 0 || n % 3 == 0) && n % 6 != 0) {
            System.out.print("TRUE");
        } else
            System.out.println("False");
    }
}
