package Feb1;

/*Implement a Banking System
Description:
HashMap stores customer accounts (AccountNumber -> Balance).
TreeMap sorts customers by balance.
Queue processes withdrawal requests.
*/

import java.util.*;

public class BankingSystem {
    static class Bank{
        private Map<String,Double> accountMap=new HashMap<>();
        private Queue<WithdrawalRequest> withdrawalQueue=new LinkedList<>();
        public void addAccount(String accountNumber,double balance){
            accountMap.put(accountNumber,balance);
        }
        public void requestWithdrawal(String accountNumber, double amount){
            withdrawalQueue.add(new WithdrawalRequest(accountNumber,amount));
        }
        public void processWithdrawals(){
            while(!withdrawalQueue.isEmpty()){
                WithdrawalRequest request=withdrawalQueue.poll();
                String acc=request.accountNumber;
                double amount=request.amount;
                if(!accountMap.containsKey(acc)){
                    System.out.println("Account not found: "+acc);
                    continue;
                }
                double balance=accountMap.get(acc);
                if(balance>=amount){
                    accountMap.put(acc,balance-amount);
                    System.out.println("Withdrawal successful: "+acc+" → ₹"+amount);
                } else System.out.println("Insufficient balance in account: "+acc);
            }
        }
        public void displayAccountsSortedByBalance(){
            Map<Double,List<String>> sortedMap=new TreeMap<>();
            for(Map.Entry<String,Double> entry:accountMap.entrySet()){
                sortedMap.computeIfAbsent(entry.getValue(),b->new ArrayList<>()).add(entry.getKey());
            }
            System.out.println("\nAccounts Sorted by Balance:");
            for(Map.Entry<Double,List<String>> entry:sortedMap.entrySet()){
                for(String acc:entry.getValue()) System.out.println(acc+" : ₹"+entry.getKey());
            }
        }
    }
    static class WithdrawalRequest{
        String accountNumber;
        double amount;
        WithdrawalRequest(String accountNumber,double amount){
            this.accountNumber=accountNumber;
            this.amount=amount;
        }
    }
    public static void main(String[] args){
        Bank bank=new Bank();
        bank.addAccount("ACC101",5000);
        bank.addAccount("ACC102",10000);
        bank.addAccount("ACC103",3000);
        bank.requestWithdrawal("ACC101",2000);
        bank.requestWithdrawal("ACC103",4000);
        bank.requestWithdrawal("ACC102",1500);
        bank.processWithdrawals();
        bank.displayAccountsSortedByBalance();
    }
}
