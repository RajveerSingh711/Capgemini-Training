package Feb11;

/*5️⃣ Validate JSON structure using Jackson.
*/

import com.fasterxml.jackson.databind.*;

public class Ques5 {
    public static void main(String[] args){
        ObjectMapper mapper=new ObjectMapper();
        String json="{ \"name\": \"Rajveer\", \"age\": 21, \"email\": \"rajveer@gmail.com\" }";
        try{
            JsonNode root=mapper.readTree(json);
            System.out.println("JSON is syntactically valid.");
            if(!root.has("name") || !root.has("age") || !root.has("email")) throw new Exception("Missing required fields!");
            if(!root.get("name").isTextual()) throw new Exception("Invalid type: name should be String");
            if(!root.get("age").isInt()) throw new Exception("Invalid type: age should be Integer");
            if(!root.get("email").isTextual()) throw new Exception("Invalid type: email should be String");
            System.out.println("JSON structure is valid ✅");
        }catch(Exception e){
            System.out.println("Invalid JSON ❌");
            System.out.println("Error: "+e.getMessage());
        }
    }
}
