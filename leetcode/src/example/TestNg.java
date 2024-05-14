package src.test.java.org.example;


import org.junit.Test;
import src.java.leetcode.Leetcode2385;
import src.java.leetcode.Leetcode2437;
import src.java.leetcode.String2TreeNode;
import src.java.leetcode.TreeNode;

public class TestNg {
    @Test
    public void test2437(){
        String s = "0?:0?";
        Leetcode2437 leetcode2437 = new Leetcode2437();
        int i = leetcode2437.countTime(s);
        System.out.println(i);
    }

    public void test2385(){
        Leetcode2385 leetcode2385 = new Leetcode2385();
        String s = "1,5,3,null,4,10,6,9,2";
        String2TreeNode string2TreeNode = new String2TreeNode();
        TreeNode treeNode = string2TreeNode.createTreeNode(s);
        int i = leetcode2385.amountOfTime(treeNode,3);
        System.out.println(i);
    }
}
