import java.util.Scanner;

public class PatternInString {
    public static int countPattern(String str, String pattern) {
        int cnt = 0;
        for(int i = 0; i <= str.length() - pattern.length(); i++) {
            if(str.charAt(i) == pattern.charAt(0) ) {
                String substr = str.substring(i, i + pattern.length());
                if(pattern.equals(substr)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String pattern = sc.next();
        int n = countPattern(str, pattern);
        System.out.println(n);
        sc.close();
    }
}