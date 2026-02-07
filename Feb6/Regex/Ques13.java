package Feb6.Regex;

/*1️⃣3️⃣ Extract Currency Values from a Text
🔹 Example Text:
"The price is $45.99, and the discount is 10.50."
🔹 Expected Output:
$45.99, 10.50
*/

import java.util.regex.*;

public class Ques13 {
    public static void main(String[] args){
        String text="The price is $45.99, and the discount is 10.50.";
        String regex="\\$?\\b\\d+(\\.\\d{2})\\b";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);
        while(matcher.find()) System.out.println(matcher.group());
    }
}
