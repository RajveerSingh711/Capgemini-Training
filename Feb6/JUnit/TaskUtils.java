package Feb6.JUnit;

/*Create a method longRunningTask() that sleeps for 3 seconds before returning a result.
Use @Timeout(2) in JUnit to fail the test if the method takes more than 2 seconds.
*/

import org.junit.jupiter.api.*;
import java.util.concurrent.TimeUnit;

public class TaskUtils {
    public String longRunningTask() throws InterruptedException{
        Thread.sleep(3000);
        return "Task Completed";
    }
}
class TaskUtilsTest{
    TaskUtils utils;
    @BeforeEach
    void setUp(){
        utils=new TaskUtils();
    }
    @Test
    @Timeout(value=2,unit=TimeUnit.SECONDS)
    void testLongRunningTaskTimeout() throws InterruptedException{
        utils.longRunningTask();
    }
}
