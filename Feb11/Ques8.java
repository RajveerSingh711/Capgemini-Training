package Feb11;

/*1️⃣ Read a JSON file and print all keys and values.
*/

import com.fasterxml.jackson.databind.*;
import java.io.*;
import java.util.*;

public class Ques8 {
    public static void main(String[] args){
        try{
            String jsonContent="{\n"+"  \"name\": \"Rajveer\",\n"+"  \"age\": 21,\n"+"  \"email\": \"rajveer@gmail.com\",\n"+"  \"address\": {\n"+"    \"city\": \"Delhi\",\n"+"    \"pincode\": 110001\n"+"  },\n"+"  \"skills\": [\"Java\", \"Spring\", \"SQL\"]\n"+"}";
            File file=new File("data.json");
            FileWriter writer=new FileWriter(file);
            writer.write(jsonContent);
            writer.close();
            ObjectMapper mapper=new ObjectMapper();
            JsonNode root=mapper.readTree(file);
            System.out.println("All Keys and Values:");
            printJson(root,"");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void printJson(JsonNode node,String indent){
        if(node.isObject()){
            Iterator<Map.Entry<String, sonNode>> fields=node.fields();
            while(fields.hasNext()){
                Map.Entry<String,JsonNode> entry=fields.next();
                System.out.println(indent+"Key: "+entry.getKey());
                printJson(entry.getValue(),indent+"  ");
            }
        }
        else if(node.isArray()){
            for(JsonNode arrayItem:node) printJson(arrayItem,indent+"  ");
        }
        else System.out.println(indent+"Value: "+node.asText());
    }
}
