package Feb6.Regex;

/*5️⃣ Extract All Capitalized Words from a Sentence
🔹 Example Text:
"The Eiffel Tower is in Paris and the Statue of Liberty is in New York."
🔹 Expected Output:
Eiffel, Tower, Paris, Statue, Liberty, New, York
*/

import java.util.*;
import java.util.regex.*;

public class Ques5 {
    public static void main(String[] args){
        String text="The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        String regex="\\b[A-Z][a-z]*\\b";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
