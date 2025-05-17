package Project;

public class BankAccount {
    private final String name;
    private double balance;

    public BankAccount(String holderName, double initialBalance){
        this.name = holderName;
        this.balance = initialBalance;
    }

    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println(amount + " withdrawn from " + name + "'s bank account");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println(amount + " deposited in " + name + "'s bank account");
        } else {
            System.out.println("Amount should be greater than 0");
        }
    }

    public void transfer(BankAccount account, double amount){
        if(balance >= amount){
            this.withdraw(amount);
            account.deposit(amount);
            System.out.println(amount + " transferred to " + account.name + " from " + name);
        } else {
            System.out.println("Insufficient balance for transfer");
        }
    }

    public void checkBalance(){
        System.out.println("Balance of " + name + " is " + balance);
    }
}
