package Lab8Exception;

import java.util.Scanner;

public class Calculator {
    int m;
    int n;

    Calculator(double m, double n) {
        this.m = (int) m;
        this.n = (int) n;
    }

    public void Add() throws ArithmeticException {
        if (m < 0 || n < 0) throw new ArithmeticException("Negative number not allowed");
        else System.out.println(m + n);
    }

    public void Subtract() throws ArithmeticException {
        if (m < 0 || n < 0) throw new ArithmeticException("Negative number not allowed");
        else System.out.println(m - n);
    }

    public void Multiply() throws ArithmeticException {
        if (m == 0 || n == 0) throw new ArithmeticException("Zero is not allowed");
        else System.out.println(m * n);
    }

    public void Division() throws ArithmeticException {
        if (m == 0 || n == 0) throw new ArithmeticException("Zero is not allowed");
        else System.out.println(m / n);
    }
}


class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b;
        try {
            System.out.println("Enter two numbers for addition : ");
            a = input.nextDouble();
            b = input.nextDouble();
            checkFormat(a, b);
            Calculator obj = new Calculator(a, b);
            obj.Add();
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println(e);
        }

        try {
            System.out.println("Enter two numbers for subtract : ");
            a = input.nextDouble();
            b = input.nextDouble();
            checkFormat(a, b);
            Calculator obj = new Calculator(a, b);
            obj.Subtract();
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println(e);
        }

        try {
            System.out.println("Enter two numbers for multiplication : ");
            a = input.nextDouble();
            b = input.nextDouble();
            checkFormat(a, b);
            Calculator obj = new Calculator(a, b);
            obj.Multiply();
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println(e);
        }

        try {
            System.out.println("Enter two numbers for division : ");
            a = input.nextDouble();
            b = input.nextDouble();
            checkFormat(a, b);
            Calculator obj = new Calculator(a, b);
            obj.Division();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void checkFormat(double a, double b) throws NumberFormatException {
        if (a != (int) a || b != (int) b) {
            throw new NumberFormatException("Not supported yet.");
        }
    }
}