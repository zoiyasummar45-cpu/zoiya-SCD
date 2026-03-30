public class Main {
  /*  public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "Zoiya";
        s1.rollNumber = 5027;

        Students s2 = new Students();
        s2.name = "Summar ";
        s2.rollNumber = 5059;

        s1.displayinfo();
        s2.displayinfo();
    }
*/
    
  public static void main(String[] args) {
    BankAccount account1 = new BankAccount(7.0, "Zoiya");
    BankAccount account2 = new BankAccount(1000.0, "Summar");

    account1.deposit(700.0);
    account1.withdraw(500.0);
    account2.deposit(500.0);
    account2.withdraw(200.0);

    account1.displayAccountInfo();
    account2.displayAccountInfo();

    System.out.println(
        "Final Details of Account 1:" + account1.getAccountHolder() + " - Balance: " + account1.getBalance());
    System.out.println(
        "Final Details of Account 2:" + account2.getAccountHolder() + " - Balance: " + account2.getBalance());
  }
}
