// Abstract class Account
abstract class Account {
    public abstract void calculateInterest(double balance);
}

// SavingsAccount class extending Account
class SavingsAccount extends Account {
    public void calculateInterest(double balance) {
        double interestRate = 0.04; // 4% interest
        double interest = balance * interestRate;
        System.out.println("Savings Account Interest: " + interest);
    }
}

// CurrentAccount class extending Account
class CurrentAccount extends Account {
    public void calculateInterest(double balance) {
        double interestRate = 0.02; // 2% interest
        double interest = balance * interestRate;
        System.out.println("Current Account Interest: " + interest);
    }
}

// Main class to test
public class Task4{
    public static void main(String[] args) {
        Account savings = new SavingsAccount();
        savings.calculateInterest(10000);

        Account current = new CurrentAccount();
        current.calculateInterest(10000);
    }
}

