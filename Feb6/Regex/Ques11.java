package Feb6.Regex;

/*1️⃣1️⃣ Validate a Credit Card Number (Visa, MasterCard, etc.)
A Visa card number starts with 4 and has 16 digits.
A MasterCard starts with 5 and has 16 digits.
*/

public class Ques11 {
    public static boolean isVisa(String card){
        return card.matches("^4\\d{15}$");
    }
    public static boolean isMasterCard(String card){
        return card.matches("^5\\d{15}$");
    }
    public static void main(String[] args) {
        System.out.println(isVisa("4111111111111111"));
        System.out.println(isMasterCard("5111111111111111"));
        System.out.println(isVisa("5111111111111111"));
        System.out.println(isMasterCard("4111111111111111"));
    }
}
