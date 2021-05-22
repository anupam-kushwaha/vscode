import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class SeperateAllInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        input = input.replaceAll("[^\\d]", "");
       
        String str = "";
        for(String s : input.split("")) {
            if(!str.contains(s)) {
                str += s;
            }
        }
        // System.out.println(str);
        char[] ch = str.toCharArray();
        Arrays.sort(ch);

        StringBuilder sb = new StringBuilder(String.valueOf(ch));
        sb = sb.reverse();
        
        // System.out.println(sb);

        if(Integer.parseInt(sb.toString()) % 2 == 0) {
            System.out.println(Integer.parseInt(sb.toString()));
        }else {
            for(int i = sb.length()-1; i >= 0; i--) {
                char c = sb.charAt(i);
                if((int)c % 2 == 0) {
                    sb.deleteCharAt(i);
                    sb.append(c);
                    System.out.println(sb);
                    System.exit(0);
                }
            }
            System.out.println(-1);  
        }
        
        sc.close();
    }
}