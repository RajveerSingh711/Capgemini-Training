package Feb6.JUnit;

/*Create a BankAccount class with:
deposit(double amount): Adds money to the balance.
withdraw(double amount): Reduces balance.
getBalance(): Returns the current balance.
✅ Write JUnit tests to check correct balance updates.
✅ Ensure withdrawals fail if funds are insufficient.
*/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class BankAccount {
    private double balance=0.0;
    public void deposit(double amount){
        if(amount>0) balance+=amount;
    }
    public void withdraw(double amount){
        if (amount>balance) throw new IllegalArgumentException("Insufficient funds");
        balance-=amount;
    }
    public double getBalance(){
        return balance;
    }
}
class BankAccountTest{
    BankAccount account;
    @BeforeEach
    void setUp(){
        account=new BankAccount();
    }
    @Test
    void testDepositUpdatesBalance(){
        account.deposit(1000);
        account.deposit(500);
        assertEquals(1500,account.getBalance());
    }
    @Test
    void testWithdrawUpdatesBalance(){
        account.deposit(1000);
        account.withdraw(400);
        assertEquals(600,account.getBalance());
    }
    @Test
    void testWithdrawInsufficientFunds(){
        account.deposit(300);
        Exception exception=assertThrows(
                IllegalArgumentException.class,
                ()->account.withdraw(500)
        );
        assertEquals("Insufficient funds",exception.getMessage());
    }
}