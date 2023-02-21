package Lab4Strings2DArrays;

import java.util.Scanner;

public class SortStrings {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = in.nextInt();
        in.nextLine();

        String name[] = new String[n];
        System.out.println("Enter names: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name [" + (i + 1) + "]: ");
            name[i] = in.next();
        }

        String temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (name[j - 1].compareTo(name[j]) > 0) {
                    temp = name[j - 1];
                    name[j - 1] = name[j];
                    name[j] = temp;
                }
            }
        }

        System.out.println("\nSorted names are in Lexicographical Order: ");
        for (int i = 0; i < n; i++) {
            System.out.println(name[i]);
        }
    }
}
