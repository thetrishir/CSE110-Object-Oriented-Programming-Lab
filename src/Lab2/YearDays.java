package Lab2;

import java.util.Scanner;

public class YearDays {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter minutes: ");
        int min = in.nextInt();
        int days = min/1440;
        int year = days/365;
        days = days%365;
        System.out.print(min+" minutes is approximately "+year+" year and "+days+" days");
    }
}
