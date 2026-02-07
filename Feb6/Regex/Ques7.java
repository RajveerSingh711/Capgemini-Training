package Feb6.Regex;

/*7️⃣ Extract Links from a Web Page
🔹 Example Text:
"Visit https://www.google.com and http://example.org for more info."
🔹 Expected Output:
https://www.google.com, http://example.org
*/

import java.util.*;
import java.util.regex.*;

public class Ques7 {
    public static void main(String[] args){
        String text="Visit https://www.google.com and http://example.org for more info.";
        String regex="https?://[A-Za-z0-9.-]+\\.[A-Za-z]{2,}(/[A-Za-z0-9._~:/?#[\\]@!$&'()*+,;=-]*)?";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
