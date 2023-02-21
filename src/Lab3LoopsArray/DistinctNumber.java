package Lab3LoopsArray;

import java.util.Scanner;

public class DistinctNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] inList = new int[10];
        System.out.print("Please enter 10 integers: ");
        for (int num : inList) {
            num = in.nextInt();
        }
        Isdistinct(inList);
    }
    public static void Isdistinct ( int[] inList){
        int counter = 0;
        int[] distinctArray = new int[10];
        distinctArray[0] = inList[0];
        for (int i = 1; i < inList.length; i++) {
            for (int j = 0; j < inList.length; j++) {
                if (inList[i] == inList[j]) {
                    counter++;
                    continue;
                } else {
                    distinctArray[i] = inList[i];
                }
            }
        }

        System.out.println("The number of distinct number is " + counter);
        System.out.print("distinct numbers are: ");
        for (int x = 0; x < distinctArray.length; x++) {
            if (distinctArray[x] != 0)
                System.out.print(distinctArray[x] + " ");
        }
    }
}