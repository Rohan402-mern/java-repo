import Project.BankAccount;

public class Test{
    public static void main(String[] args) {
        BankAccount s1 = new BankAccount("rohan", 1000);
         BankAccount s2 = new BankAccount("ritik", 1200);
         s1.checkBalance();
         s2.checkBalance();
         s1.transfer(s2, 100);
         s1.deposit(200);
         s1.checkBalance();
         s2.checkBalance();
    }
}