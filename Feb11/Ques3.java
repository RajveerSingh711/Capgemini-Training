package Feb11;

/*Read a JSON file and extract only specific fields (e.g., name, email).*/

import com.fasterxml.jackson.databind.*;
import java.io.*;

public class Ques3 {
    public static void main(String[] args){
        try{
            String jsonContent="{\n" + "  \"id\": 101,\n" +"  \"name\": \"Rajveer Singh\",\n"+"  \"email\": \"rajveer@gmail.com\",\n"+"  \"age\": 21,\n"+"  \"city\": \"Delhi\"\n"+"}";
            File file=new File("user.json");
            FileWriter writer=new FileWriter(file);
            writer.write(jsonContent);
            writer.close();
            ObjectMapper mapper=new ObjectMapper();
            JsonNode root=mapper.readTree(file);
            String name=root.get("name").asText();
            String email=root.get("email").asText();
            System.out.println("Extracted Data:");
            System.out.println("Name: "+name);
            System.out.println("Email: "+email);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
