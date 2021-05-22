package JavaBucket.hackerrank;
import java.util.Scanner;

public class NumOfCodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int[] inarr = new int[input.length()];
        int i = 0;
        for (String num : input.split("")) {
            inarr[i] = Integer.parseInt(num);
            i++;
        }
        numOfCodes();

        sc.close();
    }
}
