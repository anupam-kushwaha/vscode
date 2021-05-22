import java.util.*;
public class LongestPrefixAlsoSuffix {

    public static String findPrefix(String string) {
        int mid = string.length() / 2;
        for (int i = mid; i >= 0; i--) {
            String prefix = string.substring(0, i);
            String suffix = string.substring(string.length() - i);
            if (prefix.equals(suffix)) {
                return prefix;
            }            
        }
        return "";
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String output = findPrefix(input);
        System.out.println(output.length());

    }
}
