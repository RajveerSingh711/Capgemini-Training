package Feb11;

/*4️⃣ Validate an email field using JSON Schema.
*/

import com.fasterxml.jackson.databind.*;
import com.networknt.schema.*;
import java.util.*;

public class Ques11 {
    public static void main(String[] args) {
        try{
            ObjectMapper mapper = new ObjectMapper();
            String jsonData="{ \"name\": \"Rajveer\", \"email\": \"rajveer@gmail.com\" }";
            String schemaStr ="{\n"+"  \"$schema\": \"http://json-schema.org/draft-07/schema#\",\n"+"  \"type\": \"object\",\n"+"  \"properties\": {\n"+"    \"name\": { \"type\": \"string\" },\n" +"    \"email\": { \"type\": \"string\", \"format\": \"email\" }\n"+"  },\n"+"  \"required\": [\"name\", \"email\"]\n"+"}";
            JsonNode jsonNode=mapper.readTree(jsonData);
            JsonNode schemaNode=mapper.readTree(schemaStr);
            JsonSchemaFactory factory=JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V7);
            JsonSchema schema=factory.getSchema(schemaNode);
            Set<ValidationMessage> errors=schema.validate(jsonNode);
            if(errors.isEmpty()) System.out.println("Valid JSON ✅");
            else{
                System.out.println("Invalid JSON ❌");
                errors.forEach(error->System.out.println(error.getMessage()));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
