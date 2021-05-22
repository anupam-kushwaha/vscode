import java.util.Scanner;
public class JoinWords {
    static String joinWords(String[] words) {
        String sentence = "";
        for (String word : words) {
            sentence += word;
        }
        return sentence;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        String[] words = new String[n]; 
        while (n-- > 0) {
            words[i] = sc.next();
            i++;
        }
        System.out.println(joinWords(words));

    }
}
