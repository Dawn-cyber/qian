package leetcode;

public class Leetcode2437 {
    public int countTime(String time) {
        int ans = 1;
        char c = time.charAt(0);
        char c1 = time.charAt(1);
        char c2 = time.charAt(3);
        char c3 = time.charAt(4);
        if (c2=='?'){
            ans *= 6;
        }
        if(c3=='?'){
            ans *= 10;
        }
        if(c=='?'&&c1=='?'){
            ans *= 24;
        }else {
            if(c=='?'){
                int i = Integer.parseInt(String.valueOf(c1));
                if(i<=3){
                    ans *= 3;
                }else {
                    ans *= 2;
                }
            }
            if(c1=='?'){
                int i = Integer.parseInt(String.valueOf(c));
                if (i==2){
                    ans *= 4;
                }else {
                    ans *= 10;
                }
            }
        }
        return ans;
    }
}
