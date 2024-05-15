package leetcode;

import leetcode.Leetcode1372;
import leetcode.String2TreeNode;
import leetcode.TreeNode;

public class LeetcodeTest {
    public static void main(String[] args) {
        String temp  = "1,null,1,1,1,null,null,1,1,null,1,null,null,null,1,null,1";
        String2TreeNode string2TreeNode = new String2TreeNode();
        TreeNode root = string2TreeNode.createTreeNode(temp);
        string2TreeNode.printTreeNode(root);
        Leetcode1372 leetcode1372 = new Leetcode1372();
        int ans = leetcode1372.solution(root);
        System.out.println(ans);
    }
}
