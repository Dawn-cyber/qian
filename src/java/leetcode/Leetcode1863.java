package src.java.leetcode;

public class Leetcode1863 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3};
        int answer = 0;
        answer = dfs(nums,0,0,answer);
        System.out.println(answer);
    }

    static int dfs(int[] nums, int i, int xor_sum, int answer) {
        if(i==nums.length){
            answer+=xor_sum;
            return answer;
        }
        int temp1 = dfs(nums,i+1,xor_sum^nums[i],answer);
        int temp2 = dfs(nums,i+1,xor_sum,answer);
        return temp1+temp2;

    }

}
