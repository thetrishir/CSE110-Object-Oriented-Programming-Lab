package Lab4Strings2DArrays;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] answer = {"D", "B", "D", "C", "C", "D", "A", "E", "A", "D"};
        String[][] list = new String[8][10];
        System.out.println("Fill in the eight student's answers to 10 questions: ");
        for (int i = 0; i < list.length; i++) {
            int count = 0;
            for (int j = 0; j < list[i].length; j++) {
                list[i][j] = in.next();
                if (list[i][j].equalsIgnoreCase(answer[j]))
                    count++;
            }
            System.out.println("Student's " + i + " correct answers are " + count + " and wrong answers are " + (10 - count));
            if (count > 7)
                System.out.println("Excellent");
        }
    }
}
