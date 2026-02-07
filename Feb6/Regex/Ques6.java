package Feb6.Regex;

/*6️⃣ Extract Dates in dd/mm/yyyy Format
🔹 Example Text:
"The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020."
🔹 Expected Output:
12/05/2023, 15/08/2024, 29/02/2020
*/

import java.util.*;
import java.util.regex.*;

public class Ques6 {
    public static void main(String[] args){
        String text="The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        String regex="\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}\\b";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
