package Feb11;

/*5️⃣ Merge two JSON files into a single JSON object.
*/

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.*;
import java.io.*;

public class Ques12 {
    public static void main(String[] args){
        try{
            ObjectMapper mapper=new ObjectMapper();
            String json1="{ \"name\": \"Rajveer\", \"age\": 21 }";
            String json2="{ \"email\": \"rajveer@gmail.com\", \"city\": \"Delhi\" }";
            File file1=new File("file1.json");
            File file2=new File("file2.json");
            FileWriter writer1=new FileWriter(file1);
            writer1.write(json1);
            writer1.close();
            FileWriter writer2=new FileWriter(file2);
            writer2.write(json2);
            writer2.close();
            ObjectNode obj1=(ObjectNode) mapper.readTree(file1);
            ObjectNode obj2=(ObjectNode) mapper.readTree(file2);
            obj1.setAll(obj2);
            String mergedJson=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj1);
            System.out.println("Merged JSON:");
            System.out.println(mergedJson);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
