package Feb6.Regex;

/*4️⃣ Extract All Email Addresses from a Text
🔹 Example Text:
"Contact us at support@example.com and info@company.org"
🔹 Expected Output:
support@example.com
info@company.org
*/

import java.util.*;
import java.util.regex.*;

public class Ques4 {
    public static void main(String[] args){
        String text="Contact us at support@example.com and info@company.org";
        String regex="[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
