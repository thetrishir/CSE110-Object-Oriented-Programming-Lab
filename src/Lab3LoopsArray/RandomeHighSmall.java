package Lab3LoopsArray;

import java.util.Random;

public class RandomeHighSmall {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        highest(arr);
        smallest(arr);
    }

    public static void highest(int[] inList) {
        int high = 0, c = 0;
        for (int i = 1; i < inList.length; i++) {
            if (inList[i] > high) {
                high = inList[i];
                c = i;
            }
        }
        System.out.println("\n\nHighest value is " + high + " and index is " + c);
    }

    public static void smallest(int[] inList) {
        int small = 9999, c = 0;
        for (int i = 1; i < inList.length; i++) {
            if (inList[i] < small) {
                small = inList[i];
                c = i;
            }
        }
        System.out.println("\nSmallest value is " + small + " and index is " + c);
    }
}
