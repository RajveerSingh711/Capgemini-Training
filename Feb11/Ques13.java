package Feb11;

/*6️⃣ Convert JSON to XML format.
*/

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.dataformat.xml.*;

public class Ques13 {
    public static void main(String[] args){
        try{
            String json="{ \"name\": \"Rajveer\", \"age\": 21, \"email\": \"rajveer@gmail.com\" }";
            ObjectMapper jsonMapper=new ObjectMapper();
            JsonNode jsonNode=jsonMapper.readTree(json);
            XmlMapper xmlMapper=new XmlMapper();
            String xml=xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode);
            System.out.println("Converted XML:");
            System.out.println(xml);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
