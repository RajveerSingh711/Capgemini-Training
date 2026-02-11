package Feb11;

/*7️⃣ Parse JSON and filter only those records where age > 25.
*/

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.*;

public class Ques7 {
    public static void main(String[] args){
        try{
            ObjectMapper mapper=new ObjectMapper();
            String json="[\n"+" { \"name\": \"Raj\", \"age\": 22 },\n"+" { \"name\": \"Aman\", \"age\": 28 },\n"+" { \"name\": \"Priya\", \"age\": 30 },\n"+" { \"name\": \"Karan\", \"age\": 24 }\n"+"]";
            JsonNode root=mapper.readTree(json);
            ArrayNode filteredArray=mapper.createArrayNode();
            for(JsonNode node:root){
                if(node.get("age").asInt()>25) filteredArray.add(node);
            }
            String result=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(filteredArray);
            System.out.println("Filtered Records (age > 25):");
            System.out.println(result);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
