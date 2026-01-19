package Jan16.AccessModifiers;

/*Problem 3: Bank Account Management
Create a BankAccount class with:
accountNumber (public).
accountHolder (protected).
balance (private).
Write methods to:
Access and modify balance using public methods.
Create a subclass SavingsAccount to demonstrate access to accountNumber and accountHolder.
 */

import java.util.*;

class BankAccount {
    public long accountNumber;
    protected String accountHolder;
    private double balance;
    BankAccount(long accountNumber,String accountHolder,double balance){
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
}
class SavingsAccount extends BankAccount{
    private double interestRate;
    SavingsAccount(long accountNumber,String accountHolder,double balance,double interestRate){
        super(accountNumber,accountHolder,balance);
        this.interestRate=interestRate;
    }
    void displayDetails(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Balance: ₹"+getBalance());
        System.out.println("Interest Rate: "+interestRate+"%");
    }
    public static void main(String[] args) {
        SavingsAccount sa=new SavingsAccount(1234567890L,"Rajveer Singh",50000.0,4.5);
        sa.setBalance(55000.0);
        sa.displayDetails();
    }
}
