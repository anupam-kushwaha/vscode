package JavaBucket.hackerrank;
import java.util.Scanner; 
public class Fibonacci {
    
    public static int fib(int n) {
        if (n == 0 || n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static int fib2(int n) {
        int[] arr = new int[n + 1];
        return fibHelper(n, arr);
    }

    public static int fibHelper(int n, int[] arr) {
        if (n == 0 || n == 1) {
            return 1;
        }

        if (arr[n] > 0) {
            return arr[n];
        }
        int output = fib(n - 1) + fib(n - 2);
        arr[n] = output;
        return output;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = fib2(n);
        System.out.println(ans);
    }
}