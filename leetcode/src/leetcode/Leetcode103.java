package leetcode;

import java.util.Arrays;

public class Leetcode103 {
    public static void main(String[] args) {
        int[] coins = new int[]{2};
        int amount = 3;
        int[] dp = new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for (int i=1;i<=amount;i++){
            for (int j=0;j<coins.length;j++){
                if ((i-coins[j]>=0)&&(dp[i-coins[j]]!=Integer.MAX_VALUE)){
                    dp[i]=Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }
        }

        System.out.println(dp[amount]==Integer.MAX_VALUE?-1:dp[amount]);
    }
}
