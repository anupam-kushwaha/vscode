package JavaBucket.gfg;
import java.util.*;

public class Brackets {

    public static int validParen(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        char[] paren = s.toCharArray();
        int cnt = 0;
        for(int i = 0; i < paren.length; i++) {
            if(paren[i] =='(' || paren[i] == '{' || paren[i] == '[') {
                stack.push(paren[i]);
                cnt++;
                continue;
            }
            if(stack.empty()) {
                return cnt+1;
            }

            if(paren[i] == map.get(stack.peek())) {
                stack.pop();
                cnt++;
            }
        }
        if(stack.empty()) {
            return 0;
        }else {
            return cnt;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  input = sc.next();
        System.out.println(validParen(input));
        sc.close();
    }
}