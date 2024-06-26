package leetcode;

public class Leetcode69 {
    private String test;
    private String testtest;
    public static void main(String[] args) {
        int x = 9;
        int left = 0, right = x, ans = -1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if((long)mid*mid<=x){
                ans = mid;
                left = mid +1;
            }else {
                right = mid-1;
            }
        }
        System.out.println(ans);
    }
}
