package Jan15.Level2;

/*Program to Simulate an ATM
Problem Statement: Create a BankAccount class with attributes accountHolder, accountNumber, and balance. Add methods for:
Depositing money.
Withdrawing money (only if sufficient balance exists).
Displaying the current balance.
Explanation: The BankAccount class stores bank account details as attributes. The methods allow interaction with these attributes to modify and view the account's state.
*/

import java.util.*;

public class BankAccount{
    String accountHolder;
    long accountNumber;
    double balance;
    void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Amount Deposited: "+amount);
        }else System.out.println("Invalid deposit amount");
    }
    void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Amount Withdrawn: "+amount);
        } else System.out.println("Insufficient balance or invalid amount");
    }
    void display(){
        System.out.println("Current Balance: "+balance);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        BankAccount b=new BankAccount();
        b.accountHolder=sc.nextLine();
        b.accountNumber=sc.nextLong();
        b.balance=sc.nextDouble();
        double depositAmount=sc.nextDouble();
        b.deposit(depositAmount);
        double withdrawalAmount=sc.nextDouble();
        b.withdraw(withdrawalAmount);
        b.display();
    }
}
