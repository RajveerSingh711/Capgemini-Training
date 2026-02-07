package Feb6.Regex;

/*🔟 Validate an IP Address
A valid IPv4 address consists of four groups of numbers (0-255) separated by dots.
*/

public class Ques10 {
    public static boolean isValidIPv4(String ip){
        String regex="^((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\.){3}"+"(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)$";
        return ip.matches(regex);
    }
    public static void main(String[] args){
        System.out.println(isValidIPv4("192.168.1.1"));
        System.out.println(isValidIPv4("255.255.255.255"));
        System.out.println(isValidIPv4("256.100.1.1"));
        System.out.println(isValidIPv4("192.168.1"));
        System.out.println(isValidIPv4("01.2.3.4"));
    }
}
