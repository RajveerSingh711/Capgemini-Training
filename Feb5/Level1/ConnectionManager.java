package Feb5.Level1;

/*You need to manage a connection that requires cleanup. Implement a class that demonstrates
handling exceptions while ensuring proper resource cleanup.
*/

class Connection{
    public void open(){
        System.out.println("Connection opened");
    }
    public void close(){
        System.out.println("Connection closed");
    }
    public void execute(){
        System.out.println("Executing operation on connection");
        throw new RuntimeException("Operation failed");
    }
}
public class ConnectionManager{
    public static void manageConnection() {
        Connection connection=new Connection();
        try{
            connection.open();
            connection.execute();
        }catch(RuntimeException e){
            System.err.println("Exception occurred: "+e.getMessage());
        }finally{
            connection.close();
        }
    }
    public static void main(String[] args) {
        manageConnection();
    }
}
