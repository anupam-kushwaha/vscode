import java.util.Scanner;
public class ReverseAfterDelDuplicate {
    public static String find(String str) {
        StringBuilder sb = new StringBuilder(str);
        // char[] crr = str.toCharArray();
        String output = "";
        for(String c : str.split("")) {
            if(!output.contains(c)) {
                output += c;
            }
        }
        return output;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String ans = find(str);
		StringBuilder sb = new StringBuilder(ans);
		sb.reverse();
		System.out.println(sb);
	}
}