package Feb6.Regex;

/*8️⃣ Replace Multiple Spaces with a Single Space
🔹 Example Input:
"This is an example with multiple spaces."
🔹 Expected Output:
"This is an example with multiple spaces."
*/

import java.util.*;
import java.util.regex.*;

public class Ques8 {
    public static void main(String[] args){
        String input="This   is    an   example   with   multiple    spaces.";
        String output=input.replaceAll("\\s+"," ");
        System.out.println(output);
    }
}
