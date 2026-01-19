package Jan19.HierarchicalInheritance;

/*Sample Problem 1: Bank Account Types
Description: Model a banking system with different account types using hierarchical inheritance. BankAccount is the superclass, with SavingsAccount, CheckingAccount, and FixedDepositAccount as subclasses.
Tasks:
Define a base class BankAccount with attributes like accountNumber and balance.
Define subclasses SavingsAccount, CheckingAccount, and FixedDepositAccount, each with unique attributes like interestRate for SavingsAccount and withdrawalLimit for CheckingAccount.
Implement a method displayAccountType() in each subclass to specify the account type.
Goal: Explore hierarchical inheritance, demonstrating how each subclass can have unique attributes while inheriting from a shared superclass.
 */

import java.util.*;

class BankAccount {
    protected long accountNumber;
    protected double balance;
    BankAccount(long accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    void displayAccountType(){
        System.out.println("General Bank Account");
    }
    void displayDetails(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: ₹"+balance);
    }
}
class SavingsAccount extends BankAccount{
    private double interestRate;
    SavingsAccount(long accountNumber,double balance,double interestRate){
        super(accountNumber,balance);
        this.interestRate=interestRate;
    }
    @Override
    void displayAccountType(){
        System.out.println("Account Type: Savings Account");
    }
    void displaySavingsDetails(){
        displayAccountType();
        displayDetails();
        System.out.println("Interest Rate: "+interestRate+"%");
    }
}
class CheckingAccount extends BankAccount{
    private double withdrawalLimit;
    CheckingAccount(long accountNumber,double balance,double withdrawalLimit){
        super(accountNumber,balance);
        this.withdrawalLimit=withdrawalLimit;
    }
    @Override
    void displayAccountType(){
        System.out.println("Account Type: Checking Account");
    }
    void displayCheckingDetails(){
        displayAccountType();
        displayDetails();
        System.out.println("Withdrawal Limit: ₹"+withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount{
    private int tenure;
    FixedDepositAccount(long accountNumber,double balance,int tenure){
        super(accountNumber,balance);
        this.tenure=tenure;
    }
    @Override
    void displayAccountType(){
        System.out.println("Account Type: Fixed Deposit Account");
    }
    void displayFDDetails(){
        displayAccountType();
        displayDetails();
        System.out.println("Tenure: "+tenure+" months");
    }
    public static void main(String[] args){
        SavingsAccount sa=new SavingsAccount(1001L,50000,4.5);
        CheckingAccount ca=new CheckingAccount(1002L,30000,20000);
        FixedDepositAccount fd=new FixedDepositAccount(1003L,100000,24);
        sa.displaySavingsDetails();
        System.out.println();
        ca.displayCheckingDetails();
        System.out.println();
        fd.displayFDDetails();
    }
}