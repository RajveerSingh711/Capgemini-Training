package Feb6.Regex;

/*3️⃣ Validate a Hex Color Code
A valid hex color:
Starts with a #
Followed by 6 hexadecimal characters (0-9, A-F, a-f).
🔹 Example Inputs & Outputs
✅ "#FFA500" → Valid
✅ "#ff4500" → Valid
❌ "#123" → Invalid (too short)
*/

import java.util.*;

public class Ques3 {
    public static boolean isValidHexColor(String color){
        return color.matches("^#[0-9A-Fa-f]{6}$");
    }
    public static void main(String[] args){
        System.out.println(isValidHexColor("#FFA500"));
        System.out.println(isValidHexColor("#ff4500"));
        System.out.println(isValidHexColor("#123"));
    }
}
