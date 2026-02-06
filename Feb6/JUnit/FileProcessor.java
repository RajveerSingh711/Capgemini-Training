package Feb6.JUnit;

/*Create a class FileProcessor with the following methods:
writeToFile(String filename, String content): Writes content to a file.
readFromFile(String filename): Reads content from a file.
Write JUnit tests to check if:
✅ The content is written and read correctly.
✅ The file exists after writing.
✅ Handling of IOException when the file does not exist.
*/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileProcessor {
    public void writeToFile(String filename,String content) throws IOException{
        FileWriter writer=new FileWriter(filename);
        writer.write(content);
        writer.close();
    }
    public String readFromFile(String filename) throws IOException{
        return Files.readString(Path.of(filename));
    }
}
class FileProcessorTest{
    FileProcessor processor;
    String filename="testfile.txt";
    @BeforeEach
    void setUp(){
        processor=new FileProcessor();
    }
    @AfterEach
    void cleanUp() throws IOException{
        Files.deleteIfExists(Path.of(filename));
    }
    @Test
    void testWriteAndReadFile() throws IOException{
        String content="Hello JUnit File Test";
        processor.writeToFile(filename, content);
        String result=processor.readFromFile(filename);
        assertEquals(content,result);
    }
    @Test
    void testFileExistsAfterWriting() throws IOException{
        processor.writeToFile(filename,"Test Content");
        File file=new File(filename);
        assertTrue(file.exists());
    }
    @Test
    void testReadNonExistingFileThrowsException(){
        assertThrows(IOException.class,()->{
            processor.readFromFile("nofile.txt");
        });
    }
}