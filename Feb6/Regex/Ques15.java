package Feb6.Regex;

/*1️⃣5️⃣ Validate a Social Security Number (SSN)
🔹 Example Input:
"My SSN is 123-45-6789."
🔹 Expected Output:
✅ "123-45-6789" is valid
❌ "123456789" is invalid
*/

import java.util.regex.*;

public class Ques15 {
    public static void main(String[] args){
        String text="My SSN is 123-45-6789.";
        String regex="\\b\\d{3}-\\d{2}-\\d{4}\\b";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);
        if(matcher.find()) System.out.println("Valid SSN: "+matcher.group());
        else System.out.println("Invalid SSN");
    }
}
