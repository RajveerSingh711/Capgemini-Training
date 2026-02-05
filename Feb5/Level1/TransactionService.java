package Feb5.Level1;

/*You have a method that processes user transactions. The method needs to catch and rethrow a
custom exception with additional context about the transaction.
*/

class TransactionException extends Exception{
    public TransactionException(String message){
        super(message);
    }
    public TransactionException(String message,Throwable cause){
        super(message,cause);
    }
}
public class TransactionService{
    public static void processTransaction(String transactionId,double amount) throws TransactionException{
        try{
            if(amount<=0){
                throw new IllegalArgumentException("Transaction amount must be positive");
            }
            System.out.println("Processing transaction "+transactionId+" for amount: " +amount);
        }catch(IllegalArgumentException e){
            throw new TransactionException("Transaction failed [ID=" +transactionId+", Amount="+amount+"]",e);
        }
    }
    public static void main(String[] args){
        try{
            processTransaction("TXN101",-500);
        }catch(TransactionException e){
            System.err.println("Error occurred during transaction processing.");
            System.err.println(e.getMessage());
        }
    }
}
