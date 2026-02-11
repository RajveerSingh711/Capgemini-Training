package Feb11;

/*4️⃣ Merge two JSON objects into one.
*/

import com.fasterxml.jackson.databind.*;

public class Ques4 {
    public static void main(String[] args){
        try{
            ObjectMapper mapper=new ObjectMapper();
            String json1="{ \"name\": \"Rajveer\", \"age\": 21 }";
            String json2="{ \"email\": \"rajveer@gmail.com\", \"city\": \"Delhi\" }";
            ObjectNode obj1=(ObjectNode) mapper.readTree(json1);
            ObjectNode obj2=(ObjectNode) mapper.readTree(json2);
            obj1.setAll(obj2);
            String mergedJson=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj1);
            System.out.println("Merged JSON:");
            System.out.println(mergedJson);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
