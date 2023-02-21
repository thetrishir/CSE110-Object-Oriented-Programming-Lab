package Lab3LoopsArray;

import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a String:");
        String s = in.next();

        char[] r=new char[s.length()];
        int k=0;
        for (int i = s.length() - 1; i >= 0; i--) {
            r[k] = (char) (r[k] + s.charAt(i));
            k++;
        }

        //String c = String.valueOf(r);
        String c=new String(r);
        if (s.equals(c))
            System.out.println(s + " is a palindrome");
        else
            System.out.println(s + " is not a palindrome");

    }
}

