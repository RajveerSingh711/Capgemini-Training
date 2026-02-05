package Feb5.Level2;

/*Develop a Bank Account System where:
withdraw(double amount) method:
Throws InsufficientBalanceException if withdrawal amount exceeds balance.
Throws IllegalArgumentException if the amount is negative.
Handle exceptions in main().
Expected Behavior:
If valid, print "Withdrawal successful, new balance: X".
If balance is insufficient, throw and handle "Insufficient balance!".
If the amount is negative, throw and handle "Invalid amount!".
*/

import java.util.*;

class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message){
        super(message);
    }
}
public class BankAccount {
    private double balance;
    public BankAccount(double balance){
        this.balance=balance;
    }
    public void withdraw(double amount) throws InsufficientBalanceException,IllegalArgumentException{
        if(amount<0){
            throw new IllegalArgumentException("Invalid amount!");
        }
        if(amount>balance){
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance-=amount;
        System.out.println("Withdrawal successful, new balance: "+balance);
    }
    public static void main(String[] args){
        BankAccount account=new BankAccount(5000);
        try{
            account.withdraw(6000);
        }catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
