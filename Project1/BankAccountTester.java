package Project1;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("MOMO", 8675309, 50000.0, 101, "01/02/2000");

        BankAccount yourAccount = new BankAccount("Katara", 1234567, 1000, 1023, "01/01/2000");
        
        BankAccount.interact(myAccount);
        // BankAccount.interact(yourAccount);

    
        
    }
}
