package Lab7InheritancePolymorphism;

import java.util.Calendar;

public class Account {
    private int id = 0;
    private double balance = 0.0;
    private double annualInterestRate = 0.0;
    private Calendar dateCreated;

    Account() {
    }

    Account(int id, double bal, double annualIntRate) {
        this.id = id;
        balance = bal;
        annualInterestRate = annualIntRate;
        dateCreated = Calendar.getInstance();
    }

    public int getId() {
        return id;
    }
    public double getBalance() {
        return balance;
    }
    public double getAnnualInterestRate() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setBalance(double bal) {
        balance = bal;
    }
    public void setAnnualInterestRate(double annualIntRate) {
        annualInterestRate = annualIntRate;
    }

    public Calendar getDateCreated() {
        return dateCreated;
    }
    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12;
    }
    public double getMonthlyInterestAmount() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double withdraw) {
        balance -= withdraw;
    }
    public void deposit(double deposit) {
        balance += deposit;
    }
}


class test {
    public static void main(String[] args) {
        Account acc = new Account(1122, 20000, 4.5);
        acc.deposit(3000);
        acc.withdraw(2500);
        System.out.println("Balance: " + acc.getBalance() + " Monthly Interest: " + acc.getMonthlyInterestRate() +
                " Date: " + acc.getDateCreated().getTime());
    }
}
