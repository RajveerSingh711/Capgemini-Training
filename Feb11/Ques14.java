package Feb11;

/*7️⃣ Convert CSV data into JSON.
*/

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.*;
import com.fasterxml.jackson.dataformat.csv.*;
import java.io.*;
import java.util.*;

public class Ques14 {
    public static void main(String[] args){
        try{
            String csvData="id,name,age\n"+"1,Rajveer,21\n"+"2,Aman,23\n"+"3,Priya,22";
            File csvFile=new File("students.csv");
            FileWriter writer=new FileWriter(csvFile);
            writer.write(csvData);
            writer.close();
            CsvMapper csvMapper=new CsvMapper();
            CsvSchema schema=CsvSchema.emptySchema().withHeader();
            MappingIterator<Map<String,String>> rows=csvMapper.readerFor(Map.class).with(schema).readValues(csvFile);
            ObjectMapper jsonMapper=new ObjectMapper();
            ArrayNode jsonArray=jsonMapper.createArrayNode();
            while(rows.hasNext()){
                Map<String,String> row=rows.next();
                JsonNode jsonNode=jsonMapper.valueToTree(row);
                jsonArray.add(jsonNode);
            }
            String jsonOutput=jsonMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonArray);
            System.out.println("Converted JSON:");
            System.out.println(jsonOutput);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
