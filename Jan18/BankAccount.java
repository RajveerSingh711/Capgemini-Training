package Jan18;

/*Create a BankAccount class with the following features:
Static:
○       A static variable bankName is shared across all accounts.
○       A static method getTotalAccounts() to display the total number of accounts.
This:
○       Use this to resolve ambiguity in the constructor when initializing accountHolderName and accountNumber.
Final:
○       Use a final variable accountNumber to ensure it cannot be changed once assigned.
Instanceof:
○       Check if an account object is an instance of the BankAccount class before displaying its details.
*/

public class BankAccount{
    static String bankName="Capgemini National Bank";
    private static int total=0;
    static void getTotalAccounts(){
        System.out.println("Total Accounts: "+total);
    }
    private String accountHolderName;
    private final long accountNumber;
    private double balance;
    BankAccount(String accountHolderName,long accountNumber,double balance){
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        this.balance=balance;
        total++;
    }
    void displayDetails(Object obj){
        if (obj instanceof BankAccount){
            BankAccount acc=(BankAccount) obj;
            System.out.println("Bank Name: "+bankName);
            System.out.println("Account Holder: "+acc.accountHolderName);
            System.out.println("Account Number: "+acc.accountNumber);
            System.out.println("Balance: ₹"+acc.balance);
        } else{
            System.out.println("Object is not a BankAccount instance.");
        }
    }
    public static void main(String[] args){
        BankAccount acc1=new BankAccount("Rajveer Singh",1001L,50000);
        BankAccount acc2=new BankAccount("John Doe",1002L,75000);
        acc1.displayDetails(acc1);
        System.out.println();
        acc2.displayDetails(acc2);
        System.out.println();
        BankAccount.getTotalAccounts();
    }
}
