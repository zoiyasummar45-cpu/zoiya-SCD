public class BankAccount {
  private double balance;
  private String accountHolder;

  public BankAccount(double initialBalance, String accountHolder) {

    if (initialBalance > 0) {
      this.accountHolder= accountHolder;

      if (initialBalance >= 0) {
        this.balance = initialBalance;
      } else {
        System.out.println("Invalid initial balance. Setting balance to 0.");
        this.balance = 0.0;
      }
    }

  }

  public double getBalance() {
    return balance;
  }

  public String getAccountHolder() {
    return accountHolder;
  }

  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
    } else {
      System.out.println("Invalid deposit amount. Please enter a positive value.");
    }
  }

  public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
      System.out.println("Withdrawn Amount: " + amount);
    } else {
      System.out.println("Transaction Failed: Invalid withdrawal amount or insufficient funds.");
    }
  }

  public void displayAccountInfo() {
    System.out.println("Account Holder: " + accountHolder);
    System.out.println("Balance: " + balance);
  }

}