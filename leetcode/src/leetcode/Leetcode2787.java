package leetcode;

public class Leetcode2787 {
    public static void main(String[] args) {
        int n = 4;
        int x = 1;
        int[] dp = new int[n+1];
        dp[0] = 1;
        for(int i=1,p;(p=(int)Math.pow(i,x))<=n;i++){
            for(int j=n;j>=p;j--){
                dp[j] += dp[j-p];
                dp[j] %= 1e7;
            }
        }
        System.out.println(dp[n]);
    }
}
