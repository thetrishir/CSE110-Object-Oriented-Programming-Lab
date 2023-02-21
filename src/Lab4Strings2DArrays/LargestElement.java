package Lab4Strings2DArrays;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array: ");
        int m = in.nextInt(), n = in.nextInt();
        double[][] num = new double[m][n];
        System.out.println("Enter the array: ");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = in.nextDouble();
            }
        }
        double max = num[0][0];
        int a = 0, b = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j] > max) {
                    max = num[i][j];
                    a = i;
                    b = j;
                }
            }
        }
        System.out.println("The location of the largest element is at (" + a + ", " + b + ")");
    }
}

