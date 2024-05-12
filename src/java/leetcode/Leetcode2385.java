package src.java.leetcode;

public class Leetcode2385 {
    int ans =0;
    int target;
    public int amountOfTime(TreeNode root, int start) {
        target = start;
        int num1 = count(root);
        return ans;

    }
    public int count(TreeNode root){
        if(root==null){
            return 0;
        }
        int cl = count(root.left);
        int cr = count(root.right);
        if(root.val==target){
            ans = Math.max(cl,cr);
            return -1;
        }
        if(cl>=0&&cr>=0){
            return Math.max(cl,cr)+1;
        }
        ans = Math.max(ans,Math.abs(cl-cr));
        return Math.min(cl,cr)-1;
    }

}
