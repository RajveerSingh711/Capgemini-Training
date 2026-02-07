package Feb6.Regex;

/*1️⃣2️⃣ Extract Programming Language Names from a Text
🔹 Example Text:
"I love Java, Python, and JavaScript, but I haven't tried Go yet."
🔹 Expected Output:
Java, Python, JavaScript, Go
*/

import java.util.regex.*;

public class Ques12 {
    public static void main(String[] args){
        String text="I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        String[] languages={"JavaScript","Java","Python","Go"};
        String regex="\\b("+String.join("|",languages)+")\\b";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);
        while(matcher.find()) System.out.println(matcher.group());
    }
}
