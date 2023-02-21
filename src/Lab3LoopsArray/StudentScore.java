package Lab3LoopsArray;

import java.util.Scanner;
public class StudentScore {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the total number of students: ");
        int n = in.nextInt();
        System.out.print("enter " + n + " scores: ");
        int[] sArray = new int[n];
        int best = 0;
        for (int i=0;i<n;i++){
            sArray[i] = in.nextInt();
            if (sArray[i] > best) {
                best = sArray[i];
            }
        }
        char[] grade = new char[n];
        for (int i=0;i<n;i++) {
            grade[i] = (sArray[i] >= (best - 10)) ? 'A' : (sArray[i] >= (best - 20)) ? 'B' : (sArray[i] >= (best - 30)) ? 'C' : (sArray[i] >= (best - 40)) ? 'D' : 'F';
        }

        for (int i=0;i<n;i++) {
            System.out.println("Student " + i + " score is " + sArray[i] + " and grade is " + grade[i]);
        }
    }
}
