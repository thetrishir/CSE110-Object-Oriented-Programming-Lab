package Lab7InheritancePolymorphism;

import Lab7InheritancePolymorphism.Account;

public class CheckingAccount extends Account {
    CheckingAccount(int id, double bal, double annualIntRate) {
        super(id, bal, annualIntRate);
    }
    @Override
    public void withdraw(double withdraw) {
        super.withdraw(withdraw);
        if(withdraw >getBalance()){
            System.out.println("Account has an overdraft limit.");
        }
    }
}