import java.util.Scanner;

public class MakePalindrome {
    static int num = 0;

    public static void sumWithRev(int num) {
        int rev = 0;
        int n = num;
        while(n != 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n /= 10;
        }
        num += rev;
    }
    public static boolean isPalindrome(int num) {
        
    } 

    public static void palindrome(int num) {
        while(!isPalindrome(num)) {
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        palindrome(num);
        System.out.println(num);
        sc.close();
    }
}