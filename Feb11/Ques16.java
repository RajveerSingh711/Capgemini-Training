package Feb11;

/*Develop a Java application that reads IPL match data from JSON and CSV files, processes the data based on defined censorship rules, and writes the sanitized data back to new files.

📌 Requirements
1️⃣ Input Data Formats
The application should support:
JSON Input: IPL match data in JSON format.
CSV Input: IPL match data in CSV format.
2️⃣ Censorship Rules
The program should apply the following censorship:
Mask Team Names: Replace part of the team name with "***".
Example: "Mumbai Indians" → "Mumbai ***"
Redact Player of the Match: Replace player names with "REDACTED".
3️⃣ Output Data Formats
Generate censored JSON and CSV files after processing.
*/

import com.fasterxml.jackson.core.type.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.*;
import com.fasterxml.jackson.dataformat.csv.*;
import java.io.*;
import java.util.*;

public class Ques16 {
    private static String maskTeam(String team){
        String[] parts=team.split(" ");
        return parts[0]+" ***";
    }
    public static void main(String[] args){
        try{
            ObjectMapper jsonMapper=new ObjectMapper();
            CsvMapper csvMapper = new CsvMapper();
            File jsonInput=new File("ipl_input.json");
            List<ObjectNode> matches=jsonMapper.readValue(jsonInput,new TypeReference<List<ObjectNode>>(){});
            for(ObjectNode match:matches){
                String team1=match.get("team1").asText();
                String team2=match.get("team2").asText();
                match.put("team1",maskTeam(team1));
                match.put("team2",maskTeam(team2));
                match.put("winner",maskTeam(match.get("winner").asText()));
                match.put("player_of_match","REDACTED");
            }
            jsonMapper.writerWithDefaultPrettyPrinter().writeValue(new File("ipl_output.json"),matches);
            File csvInput=new File("ipl_input.csv");
            CsvSchema schema=CsvSchema.emptySchema().withHeader();
            List<Map<String,String>> csvData=csvMapper.readerFor(Map.class).with(schema).readValues(csvInput).readAll();
            List<Map<String,String>> censoredCsv=new ArrayList<>();
            for (Map<String,String> row:csvData){
                row.put("team1",maskTeam(row.get("team1")));
                row.put("team2",maskTeam(row.get("team2")));
                row.put("winner",maskTeam(row.get("winner")));
                row.put("player_of_match","REDACTED");
                censoredCsv.add(row);
            }
            CsvSchema outputSchema=CsvSchema.builder().addColumn("match_id").addColumn("team1").addColumn("team2").addColumn("score_team1").addColumn("score_team2").addColumn("winner").addColumn("player_of_match").build().withHeader();
            csvMapper.writer(outputSchema).writeValue(new File("ipl_output.csv"),censoredCsv);
            System.out.println("Censorship completed successfully ✅");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
