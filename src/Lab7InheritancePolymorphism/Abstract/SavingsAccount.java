package Lab7InheritancePolymorphism.Abstract;

import java.util.Calendar;

public class SavingsAccount extends Account {
    private long creditCard;
    private Calendar expiryDate = Calendar.getInstance();

    SavingsAccount(int id, double bal, double annualIntRate, long creditCard) {
        super(id, bal, annualIntRate);
        this.creditCard=creditCard;
        expiryDate.set(2030,8,25);
    }

    double balance = getBalance();
    public double getCreditBalance(){
        return getBalance()*3;
    }
    public long getCreditCard(){
        return creditCard;
    }
    public Calendar getExpiryDate(){
        return expiryDate;
    }

    public void withdraw(double withdraw) {
        balance -= withdraw;
    }
    public void deposit(double deposit) {
        balance += deposit;
    }
}
