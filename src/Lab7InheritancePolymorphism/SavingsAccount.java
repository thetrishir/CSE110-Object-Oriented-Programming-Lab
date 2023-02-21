package Lab7InheritancePolymorphism;

import Lab7InheritancePolymorphism.Account;

import java.util.Calendar;

public class SavingsAccount extends Account {
    private long creditCardNumber;
    private Calendar expiryDate = Calendar.getInstance();

    public SavingsAccount(int id, double bal, double annualIntRate, long creditCardNumber) {
        super(id, bal, annualIntRate);

        expiryDate.set(2030,12,31);
        this.creditCardNumber = creditCardNumber;
    }

    public double getCreditBalance(){
        return getBalance()*3;
    }
    public long getCreditCardNumber(){
        return creditCardNumber;
    }
    public Calendar getExpiryDate(){
        return expiryDate;
    }
}
