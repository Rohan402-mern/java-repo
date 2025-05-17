package Project;

public class Account {

    private final String holderName;
    private final String accountName;
    private double balance = 1000;

    public Account(String holderName, String accountName){
        this.holderName = holderName;
        this.accountName = accountName;
    
    }

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println(amount + " deposited in your Account");
        }
        else{
            System.out.println("Please Enter amount greater than 0");
        }
    }

    public void withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
            System.out.println(amount + " withdrawed succesfully from your account");
        }
        else{
            System.out.println("Insufficent balance!");
        }
    }

    public void detail(){
        System.out.println(holderName);
        System.out.println(accountName);
    }

    public void checkBalance(){
        System.out.println(balance);
    }

}
