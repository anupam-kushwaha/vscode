import java.util.Scanner;
import java.util.Arrays;

public class palin {
    static int[] counts = new int[26];
    public static String makePalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        char c = ',';
        for(int i = 0; i < counts.length; i++) {
            if(counts[i] % 2 == 0) { // even counts
                int t = counts[i];
                while(t-- > 0) {
                    sb.append((char)counts[i]);
                }
            }else { // one char with 1 count 
               c = (char)counts[i]; 
            }
        }
        String ans = sb.toString();
        String rev = sb.reverse().toString();
        if(c != ',') {
            ans = ans + c + rev;
        }else {
            ans = ans + rev;
        }
        return ans;
    }
    
    public static boolean canBePalindrome(String s) {
        for(int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'A']++;
        }
        
        int onlyOne = 0; // only one char can have odd count
        for(int count : counts) {
            if(count % 2 != 0) {
                onlyOne++;
                if(onlyOne > 1) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void printPalindrome(String s) {
        if(!canBePalindrome(s)) {
            System.out.println("NO SOLUTION");
        }else {
            System.out.println(makePalindrome(s));
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        printPalindrome(s);
        
    }
}