package Exception;

public class BankAccount {
    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public void withdraw(double amount) throws Exception{
        if(amount > balance){
            throw new InsufficentException(10);
        }
       else{
         balance-=amount;
         System.out.println("Withdrawal of rs " + amount + " successful");
       }
    }

}
