package Feb6.JUnit;

/*Create a class DatabaseConnection with a method connect() and disconnect().
Use @BeforeEach to initialize a database connection before each test.
Use @AfterEach to close the connection after each test.
Write JUnit test cases to verify that the connection is established and closed correctly.
*/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class DatabaseConnection {
    private boolean connected=false;
    public void connect(){
        connected=true;
        System.out.println("Database connected");
    }
    public void disconnect(){
        connected=false;
        System.out.println("Database disconnected");
    }
    public boolean isConnected(){
        return connected;
    }
}
class DatabaseConnectionTest{
    DatabaseConnection db;
    @BeforeEach
    void setUp(){
        db=new DatabaseConnection();
        db.connect();
    }
    @AfterEach
    void tearDown(){
        db.disconnect();
    }
    @Test
    void testConnectionEstablished(){
        assertTrue(db.isConnected());
    }
    @Test
    void testConnectionClosed(){
        db.disconnect();
        assertFalse(db.isConnected());
    }
}