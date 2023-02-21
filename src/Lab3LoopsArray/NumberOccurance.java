package Lab3LoopsArray;

import java.util.Scanner;

public class NumberOccurance {
    public static void main(String args[]){

        int[] myList = new int[100];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers from 1-100 (input 0 value to end inputs): ");
        int index = 0;
        for(int i = 1; i < myList.length - 1; i++){
            if(i > 0){
                index = input.nextInt();
                myList[index-1]++;
            }

            if(myList[index-1] > 1)
                System.out.println(index + " occurs " + myList[index-1] + " times ");
            else
                System.out.println(index + " occurs " + myList[index-1] + " time ");
        }

    }

}