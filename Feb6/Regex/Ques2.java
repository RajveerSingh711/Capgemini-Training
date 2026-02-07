package Feb6.Regex;

/*2️⃣ Validate a License Plate Number
License plate format: Starts with two uppercase letters, followed by four digits.
Example: "AB1234" is valid, but "A12345" is invalid.
*/

import java.util.*;

public class Ques2 {
    public static boolean isValidPlate(String plate){
        return plate.matches("^[A-Z]{2}[0-9]{4}$");
    }
    public static void main(String[] args){
        System.out.println(isValidPlate("AB1234"));
        System.out.println(isValidPlate("A12345"));
        System.out.println(isValidPlate("ab1234"));
    }
}
