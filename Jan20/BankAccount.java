package Jan20;

/*4. Banking System
Description: Create a banking system with different account types:
Define an abstract class BankAccount with fields like accountNumber, holderName, and balance.
Add methods like deposit(double amount) and withdraw(double amount) (concrete) and calculateInterest() (abstract).
Implement subclasses SavingsAccount and CurrentAccount with unique interest calculations.
Create an interface Loanable with methods applyForLoan() and calculateLoanEligibility().
Use encapsulation to secure account details and restrict unauthorized access.
Demonstrate polymorphism by processing different account types and calculating interest dynamically.
*/

import java.util.*;

interface Loanable{
    void applyForLoan();
    double calculateLoanEligibility();
}
public abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    protected double balance;
    BankAccount(String accountNumber,String holderName,double balance){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public String getHolderName(){
        return holderName;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
        }
    }
    public abstract double calculateInterest();
    public void displayDetails() {
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Holder Name: "+holderName);
        System.out.println("Balance: "+balance);
    }
}
class SavingsAccount extends BankAccount implements Loanable{
    SavingsAccount(String accNo,String name,double balance){
        super(accNo,name,balance);
    }
    @Override
    public double calculateInterest(){
        return balance*0.04;
    }
    @Override
    public void applyForLoan(){
        System.out.println("Loan application submitted for Savings Account");
    }
    @Override
    public double calculateLoanEligibility(){
        return balance*5;
    }
}
class CurrentAccount extends BankAccount implements Loanable{
    CurrentAccount(String accNo,String name,double balance){
        super(accNo,name,balance);
    }
    @Override
    public double calculateInterest(){
        return balance*0.02;
    }
    @Override
    public void applyForLoan(){
        System.out.println("Loan application submitted for Current Account");
    }
    @Override
    public double calculateLoanEligibility(){
        return balance*10;
    }
    public static void main(String[] args){
        List<BankAccount> accounts = new ArrayList<>();
        BankAccount acc1=new SavingsAccount("SB101","Raj",50000);
        BankAccount acc2=new CurrentAccount("CA202","John",80000);
        accounts.add(acc1);
        accounts.add(acc2);
        for(BankAccount acc:accounts){
            acc.displayDetails();
            double interest=acc.calculateInterest();
            System.out.println("Interest: "+interest);
            if(acc instanceof Loanable){
                ((Loanable)acc).applyForLoan();
                System.out.println("Loan Eligibility: "+((Loanable)acc).calculateLoanEligibility());
            }
            System.out.println("----------------------");
        }
    }
}