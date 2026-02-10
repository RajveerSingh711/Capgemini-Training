package Feb9;

/*8️⃣ Validate CSV Data Before Processing
Ensure that the "Email" column follows a valid email format using regex.
Ensure that "Phone Numbers" contain exactly 10 digits.
Print any invalid rows with an error message.
*/

import java.nio.file.*;
import java.util.stream.*;
import java.util.regex.*;
import java.io.*;

public class Ques8 {
    private static final Pattern EMAIL_PATTERN=Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    private static final Pattern PHONE_PATTERN=Pattern.compile("^\\d{10}$");
    public static void main(String[] args){
        String filePath="contacts.csv";
        try(Stream<String> lines=Files.lines(Paths.get(filePath))){
            lines.skip(1).map(line->line.split("\\s*,\\s*")).forEach(data->{
                        String id=data[0];
                        String name=data[1];
                        String email=data[2];
                        String phone=data[3];
                        boolean valid=true;
                        if(!EMAIL_PATTERN.matcher(email).matches()){
                            System.out.println("Invalid Email → ID: "+id+", Name: "+name+", Email: "+email);
                            valid=false;
                        }
                        if(!PHONE_PATTERN.matcher(phone).matches()) {
                            System.out.println("Invalid Phone → ID: " +id+", Name: "+name+", Phone: "+phone);
                            valid=false;
                        }
                        if(!valid) System.out.println("----------------------------------");
                    });
        }catch(IOException e){
            System.out.println("Error reading CSV file.");
            e.printStackTrace();
        }
    }
}
