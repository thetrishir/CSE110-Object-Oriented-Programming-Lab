package Lab7InheritancePolymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Account> accounts = new ArrayList();
        System.out.println("\nPress (1) for creating a Savings Account\nPress (2) for creating a Checking Account");
        Scanner in = new Scanner(System.in);
        switch (in.nextInt()) {
            case 1: {
                SavingsAccount[] accs=new SavingsAccount[10];
                for (int i = 0; i < 2; i++) {
                    System.out.println("\nEnter ID, balance, annual interest rate (in %), credit Card Number for account(" + (i + 1) + "): ");
                    accs[i] = new SavingsAccount(in.nextInt(), in.nextDouble(), in.nextDouble(), in.nextLong());
                    System.out.println("Enter amount of deposit and withdraw for account " + (i + 1));
                    accs[i].deposit(in.nextDouble());
                    accs[i].withdraw(in.nextDouble());

                    System.out.println("\nThis is a Savings Account\n" +
                            "\nAccount ID: " + accs[i].getId()+
                            "\nDate Created: " +accs[i].getDateCreated().getTime()+
                            "\nCurrent Balance:" +accs[i].getBalance()+
                            "\nAnnual Interest Rate:" +accs[i].getAnnualInterestRate()+
                            "\nMonthly Interest Amount: " +accs[i].getMonthlyInterestAmount()+
                            "\nCredit Card Number:" + accs[i].getCreditCardNumber()+
                            "\nCard Expiry Date: " + accs[i].getExpiryDate().getTime()+
                            "\nCredit Balance: "+accs[i].getCreditBalance());
                }
                break;
            }
            case 2: {
                Account[] accs=new CheckingAccount[10];
                for (int i = 0; i < 4; i++) {
                    System.out.println("\nEnter ID, balance, annual interest rate (in %) for account(" + (i + 1) + "): ");
                    accs[i]=new CheckingAccount(in.nextInt(),in.nextDouble(),in.nextDouble());
                    System.out.println("Enter amount of deposit and withdraw for account "+(i+1));
                    accs[i].deposit(in.nextDouble());
                    accs[i].withdraw(in.nextDouble());

                    System.out.println("\nThis is a Checking Account\n" +
                            "\nAccount ID: " + accs[i].getId()+
                            "\nDate Created: " +accs[i].getDateCreated().getTime()+
                            "\nCurrent Balance:" +accs[i].getBalance()+
                            "\nAnnual Interest Rate:" +accs[i].getAnnualInterestRate()+
                            "\nMonthly Interest Amount: " +accs[i].getMonthlyInterestAmount());
                }
                break;
            }
        }
    }
}
