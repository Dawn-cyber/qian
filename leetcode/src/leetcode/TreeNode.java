package leetcode;

public class TreeNode {
    public int val;
    public TreeNode right;
    public TreeNode left;

    public TreeNode(int value) {
        this.val = value;
    }
    public TreeNode(){}

    public TreeNode(int value,TreeNode right,TreeNode left){
        this.val = value;
        this.left = left;
        this.right = right;
    }

}
