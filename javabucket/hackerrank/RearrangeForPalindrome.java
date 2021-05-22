package JavaBucket.hackerrank;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RearrangeForPalindrome {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String res;
        char [] wordf = word.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        // map is storing freq. of each string char
        for(char c : wordf) {
            if(map.containsKey(c)) {
                map.put(c,map.get(c)+1);
            }
            else {
                map.put(c,1);
            }
        }

        int i =0,count=0;
        char r =',';

        for(Map.Entry<Character,Integer> entry : map.entrySet()) {
            if(((entry.getValue()%2)!=0) && (entry.getValue()>1)){

                    System.out.println("NO SOLUTION");
                    System.exit(0);
            }            
            else {
                char c1 = entry.getKey();
                int n1 = entry.getValue();
                int n2;
                if(n1%2 ==0){
                    n2=n1/2;
                    while(n2!=0){
                        sb.append(c1);
                        n2--;
                    }
                }
                else{
                    r = c1;
                    count++;
                    if(count>1){
                        System.out.print("NO SOLUTION");
                        System.exit(0);
                    } 
                }
            }
        }
        String rs = sb.toString();
        if(r!=','){
            res = rs+ r+ sb.reverse().toString();
        }
        else{
            res = rs+ sb.reverse().toString();
        }
        System.out.println(res);
    }
    
}