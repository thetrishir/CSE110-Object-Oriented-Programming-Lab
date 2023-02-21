package Lab7InheritancePolymorphism.Abstract;

public class CheckingAccount extends Account {
    CheckingAccount(int id, double bal, double annualIntRate) {
        super(id, bal, annualIntRate);
    }

    double balance = getBalance();
    public void withdraw(double withdraw) {
        balance -= withdraw;
        if(withdraw>getBalance()){
            System.out.println("Account has an overdraft limit.");
        }
    }
    public void deposit(double deposit) {
        balance += deposit;
    }

}
