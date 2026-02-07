package Feb6.Regex;

/*9️⃣ Censor Bad Words in a Sentence
Given a list of bad words, replace them with ****.
🔹 Example Input:
"This is a damn bad example with some stupid words."
🔹 Expected Output:
"This is a **** bad example with some **** words."
*/

public class Ques9 {
    public static void main(String[] args){
        String text="This is a damn bad example with some stupid words.";
        String[] badWords={"damn","stupid"};
        String regex="\\b("+String.join("|",badWords)+")\\b";
        String censoredText = text.replaceAll(regex,"****");
        System.out.println(censoredText);
    }
}
