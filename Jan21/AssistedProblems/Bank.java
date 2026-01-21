package Jan21.AssistedProblems;

/*Problem 2: Bank and Account Holders (Association)
Description: Model a relationship where a Bank has Customer objects associated with it. A Customer can have multiple bank accounts, and each account is linked to a Bank.
Tasks:
Define a Bank class and a Customer class.
Use an association relationship to show that each customer has an account in a bank.
Implement methods that enable communication, such as openAccount() in the Bank class and viewBalance() in the Customer class.
Goal: Illustrate association by setting up a relationship between customers and the bank.
*/

import java.util.*;

class Account{
    private Bank bank;
    private double balance;
    Account(Bank bank,double balance){
        this.bank=bank;
        this.balance=balance;
    }
    double getBalance(){
        return balance;
    }
    Bank getBank(){
        return bank;
    }
}
class Customer{
    private String name;
    ArrayList<Account> accounts=new ArrayList<>();
    Customer(String name){
        this.name=name;
    }
    void addAccount(Account account){
        accounts.add(account);
    }
    void viewBalance(){
        System.out.println("Customer: "+name);
        for(Account acc:accounts){
            System.out.println("Bank: "+acc.getBank().getBankName()+", Balance: "+acc.getBalance());
        }
    }
}
public class Bank {
    private String bankName;
    ArrayList<Account> accounts=new ArrayList<>();
    Bank(String bankName){
        this.bankName=bankName;
    }
    String getBankName(){
        return bankName;
    }
    void openAccount(Customer customer,double balance){
        Account account=new Account(this,balance);
        accounts.add(account);
        customer.addAccount(account);
    }
    public static void main(String[] args) {
        Bank sbi=new Bank("SBI");
        Bank hdfc=new Bank("HDFC");
        Customer rahul=new Customer("Rahul");
        sbi.openAccount(rahul,5000);
        hdfc.openAccount(rahul,10000);
        rahul.viewBalance();
    }
}
