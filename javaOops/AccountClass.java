//4th QUE Parent class
public class AccountClass {
    //private variables
    private double balance;
    private String bankName;

    // Constructor without arguments
    public AccountClass() {
        this.balance = 0.00;
    }
    // Constructor with arguments
    public AccountClass(double initialBalance, String bank) {
        this.balance = initialBalance;
        this.bankName = bank;
    }
    // Method to withdraw balance
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println(bankName+": Withdrawn amount: " + amount+"/-");
            System.out.println("");
            System.out.println(bankName+": Current balance after withdrawl of "+amount+" is "+balance+"/-");
        } else {
            System.out.println(bankName+": Insufficient balance to withdraw");
        }
    }
    // Method to deposit balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println(bankName+": Deposited amount: " + amount+"/-");
            System.out.println("");
            System.out.println(bankName+": Current balance after deposit of "+amount+" is "+ balance+"/-");
        } else {
            System.out.println(bankName+": Invalid amount to deposit");
        }
    }
    // Get method for the balance and bank name
    public double getBalance() {
        return balance;
    }
    public String getBankName() {
        return bankName;
    }
}
