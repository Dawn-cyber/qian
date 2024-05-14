package src.java.leetcode;


public class Leetcode1372 {
    int ans;
    public int solution(TreeNode root) {
        if(root==null){
            return 0;
        }
        ans = 0;
        dfs(root,false,0);
        dfs(root,true,0);
        return ans;
    }

    void dfs(TreeNode root,boolean flag,int count){
        ans = Math.max(ans,count);
        if(root==null){
            return;
        }
        if(!flag){
            if(root.left!=null){
                dfs(root.left,true,count+1);
            }
            if(root.right!=null){
                dfs(root.right,false,1);
            }
        }else{
            if(root.right!=null){
                dfs(root.right,false,count+1);
            }
            if(root.left!=null){
                dfs(root.left,true,1);
            }
        }
    }
}
