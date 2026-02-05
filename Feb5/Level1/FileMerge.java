package Feb5.Level1;

/*You need to read data from two different files and write the combined result to a third file.
Ensure that all resources are properly closed, even if an exception occurs.
*/

import java.io.*;

public class FileMerge {
    public static void main(String[] args){
        String file1="input1.txt";
        String file2="input2.txt";
        String outputFile="output.txt";
        try(
                BufferedReader reader1=new BufferedReader(new FileReader(file1));
                BufferedReader reader2=new BufferedReader(new FileReader(file2));
                BufferedWriter writer=new BufferedWriter(new FileWriter(outputFile))
        ){
            String line;
            while((line=reader1.readLine())!=null) {
                writer.write(line);
                writer.newLine();
            }
            while((line=reader2.readLine()) !=null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Files merged successfully into "+outputFile);
        }catch(IOException e){
            System.err.println("Error while processing files: "+e.getMessage());
        }
    }
}
