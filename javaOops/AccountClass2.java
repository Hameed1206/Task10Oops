//4th QUE child class
public class AccountClass2 {
    
    public static void main(String[] args) {
        // Create an instance of the AccountClass with initial balance of 50000
        AccountClass aClass = new AccountClass(50000,"HDFC BANK");

        // Print the initial balance available in the account
        System.out.println("Initial balance that is available in "+aClass.getBankName()+" account is "+aClass.getBalance()+"/-");
        System.out.println("");

        // Withdraw 25000 from the account
        aClass.withdraw(25000);
        System.out.println("");

        // Deposit 50000 into the account
        aClass.deposit(50000);
        System.out.println("");

        // Print the closing account balance after all transactions
        System.out.println(aClass.getBankName()+": Closing account balance after all transactions is "+aClass.getBalance()+"/-");

    }
}
