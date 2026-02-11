package Feb11;

/* 3️⃣ Filter JSON data: Print only users older than 25 years. */

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.*;

public class Ques10 {
    public static void main(String[] args){
        try{
            ObjectMapper mapper=new ObjectMapper();
            String json="[\n"+" { \"name\": \"Raj\", \"age\": 22 },\n"+" { \"name\": \"Aman\", \"age\": 28 },\n"+" { \"name\": \"Priya\", \"age\": 30 },\n"+" { \"name\": \"Karan\", \"age\": 24 }\n"+"]";
            JsonNode root=mapper.readTree(json);
            ArrayNode filteredUsers=mapper.createArrayNode();
            for(JsonNode user:root){
                if(user.get("age").asInt()>25) filteredUsers.add(user);
            }
            String result=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(filteredUsers);
            System.out.println("Users older than 25:");
            System.out.println(result);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
