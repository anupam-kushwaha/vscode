import java.util.Scanner; 
public class NumOfBalancedBST {
    static final int MOD = 1000000007;
    public static long findNumOfBST(int h) {
        if (h == 0 || h == 1) {
            return 1;
        }
        long x = findNumOfBST(h - 1);
        long y = findNumOfBST(h - 2);
        long res1 = x * x;
        long res2 = x * y * 2;

        long ans1 = res1 % MOD;
        long ans2 = res2 % MOD;

        long ans = (ans1 + ans2) % MOD;
        
        return ans;
    }

    public static long numOfBalancedBST(int h) {
        long[] dp = new long[h + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= h; i++) {
            long x = dp[i - 1];
            long y = dp[i - 2];
            dp[i] = (x * (x + (2 * y) % MOD) % MOD) % MOD;
        }
        return dp[h];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        long ans = numOfBalancedBST(h);
        System.out.println(ans);
    }
}
