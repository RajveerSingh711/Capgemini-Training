package Feb9;

/*🔟 Merge Two CSV Files
You have two CSV files:
students1.csv (contains ID, Name, Age)
students2.csv (contains ID, Marks, Grade)
Merge both files based on ID and create a new file containing all details.
*/

import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.util.stream.*;

public class Ques10 {
    public static void main(String[] args){
        String file1="students1.csv";
        String file2="students2.csv";
        String outputFile="students_merged.csv";
        Map<String, String[]> studentInfo=new HashMap<>();
        try(Stream<String> lines=Files.lines(Paths.get(file1))) {
            lines.skip(1)
                    .map(line->line.split("\\s*,\\s*"))
                    .forEach(data->{
                        studentInfo.put(data[0],new String[]{data[1],data[2]});
                    });
        }catch(IOException e){
            System.out.println("Error reading students1.csv");
            e.printStackTrace();
        }
        try(
                Stream<String> lines=Files.lines(Paths.get(file2));
                FileWriter writer=new FileWriter(outputFile)
        ){
            writer.write("ID,Name,Age,Marks,Grade\n");
            lines.skip(1).map(line->line.split("\\s*,\\s*")).forEach(data->{
                        String id=data[0];
                        if(studentInfo.containsKey(id)){
                            String[] info=studentInfo.get(id);
                            String marks=data[1];
                            String grade=data[2];
                            try{
                                writer.write(id+","+info[0]+","+info[1]+","+marks+","+grade+"\n");
                            }catch(IOException e){
                                e.printStackTrace();
                            }
                        }
                    });
            System.out.println("CSV files merged successfully!");
        }catch(IOException e){
            System.out.println("Error reading students2.csv or writing output.");
            e.printStackTrace();
        }
    }
}
