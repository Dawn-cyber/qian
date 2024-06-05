package leetcode;

public class Leetcode171 {
    public int titleToNumber(String columnTitle) {
        int length = columnTitle.length();
        int ans = 0;
        for(int i=length-1;i>=0;i--){
            char c = columnTitle.charAt(i);
            ans += (c-'A'+1)*Math.pow(26,length-i-1);
        }
        return ans;
    }
}
